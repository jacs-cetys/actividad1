package com.cetys.drawings;

import java.awt.Color;

public class Rectangle implements Figure
{
    private Color outline, filler;
    private int originX, originY, endX, endY;

    @Override
    public void move() {
        moveRectangle();
    }

    @Override
    public void draw() {
        drawRectangle();
    }

    public void moveRectangle() {
        // todo: code to move Rectangle
    }

    public void drawRectangle() {
        // todo: code to draw Rectangle
    }

    public int getWidth() {
        return this.endX - this.originX;
    }

    public int getHeight() {
        return this.endY - this.originY;
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

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }


}
