package com.practice.chapter5.practice4;

import java.awt.*;

public class Ball extends Thread {
    public static final int SIZE = 20;
    public static final int INTERVAL = 10;
    private int x, y;
    private int xInterval, yInterval;
    private DirectionStrategy directionStrategy;
    private DrawStrategy drawStrategy;
    private Color color;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        this.xInterval = this.yInterval = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxInterval() {
        return xInterval;
    }

    public int getyInterval() {
        return yInterval;
    }

    public void setIntervals(int xInterval, int yInterval) {
        this.xInterval = xInterval;
        this.yInterval = yInterval;
    }

    public DirectionStrategy getDirectionStrategy() {
        return directionStrategy;
    }

    public void setDirectionStrategy(DirectionStrategy directionStrategy) {
        this.directionStrategy = directionStrategy;
    }

    public DrawStrategy getDrawStrategy() {
        return drawStrategy;
    }

    public void setDrawStrategy(DrawStrategy drawStrategy) {
        this.drawStrategy = drawStrategy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw() {
        drawStrategy.draw(this);
    }

    public void move() {
        directionStrategy.move(this);
    }

    @Override
    public void run() {
        draw();
        move();
    }
}
