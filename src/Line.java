package com.cetys.drawings;

import java.awt.Color;

public class Line implements Figure
{
    private Color outline;
    private int x1, y1, x2, y2, originX, originY;

    @Override
    public void move() {
        moveLine();
    }

    @Override
    public void draw() {
        drawLine();
    }

    public void drawLine()
    {
        /* todo: code to draw line
                 use graphics to g.drawLine(x1, y1, x2, y2);
         */
    }

    public void moveLine()
    {
        /* todo: code to move line
                use graphics to update x1, y1, x1 & y2
        */
    }


    // ***** GETTERS & SETTERS *****
    public Color getOutline() {
        return outline;
    }

    public void setOutline(Color outline) {
        this.outline = outline;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getOriginX() {
        return originX;
    }

    public void setOriginX(int originX) {
        this.originX = originX;
    }

    public int getOriginY() {
        return originY;
    }

    public void setOriginY(int originY) {
        this.originY = originY;
    }
}
