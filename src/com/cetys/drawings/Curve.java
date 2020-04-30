package com.cetys.drawings;

import java.awt.Color;

public class Curve implements Figure
{
    private Color outline;
    private int x1, y1, x2, y2, x3, y3, originX, originY;

    @Override
    public void move() {
        moveCurve();
    }

    @Override
    public void draw() {
        drawCurve();
    }

    public void drawCurve()
    {
        /* todo: code to draw Curve
                use graphics to QuadCurve2D q = new QuadCurve2D.Float();
                q.setCurve(x1, y1, x2, y2, x3, y3);
                g2.draw(q);
         */
    }

    public void moveCurve()
    {
        // todo: code to move Curve
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

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
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
