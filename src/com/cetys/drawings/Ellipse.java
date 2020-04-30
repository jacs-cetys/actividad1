package com.cetys.drawings;

import java.awt.Color;

public class Ellipse implements Figure
{
    private Color outline, filler;
    private int centerX, centerY, radioVert, radioHorz;

    @Override
    public void move() {
        moveEllipse();
    }

    @Override
    public void draw() {
        drawEllipse();
    }

    public void moveEllipse() {
        // todo: code to move Ellipse
    }

    public void drawEllipse() {
        // todo: code to draw Ellipse
    }

    public int getOriginX() {
        return centerX - (radioHorz / 2);
    }

    public int getOriginY() {
        return centerY - (radioVert / 2);
    }

    // ***** GETTERS & SETTERS *****
    public Color getOutline() {
        return outline;
    }

    public void setOutline(Color outline) {
        this.outline = outline;
    }

    public Color getFiller() {
        return filler;
    }

    public void setFiller(Color filler) {
        this.filler = filler;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public int getRadioVert() {
        return radioVert;
    }

    public void setRadioVert(int radioVert) {
        this.radioVert = radioVert;
    }

    public int getRadioHorz() {
        return radioHorz;
    }

    public void setRadioHorz(int radioHorz) {
        this.radioHorz = radioHorz;
    }
}
