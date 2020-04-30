package com.cetys.drawings;

import java.awt.Dimension;
import java.awt.Graphics;

import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class Drawing extends JComponent
{
    private List<Figure> figures;

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        figures.forEach(f->f.draw());
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(400, 400);
    }

    public Dimension getMinimumSize() {
        return getPreferredSize();
    }


    public static void main(String args[])
    {
        JFrame mainFrame = new JFrame("Graphics demo");



        mainFrame.getContentPane().add(new Drawing());
        mainFrame.pack();
        mainFrame.setVisible(true);
    }


}


