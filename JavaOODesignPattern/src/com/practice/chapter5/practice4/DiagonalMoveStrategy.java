package com.practice.chapter5.practice4;

public class DiagonalMoveStrategy extends DirectionStrategy {
    @Override
    public void move(Ball ball) {
        ball.setIntervals(Ball.INTERVAL, Ball.INTERVAL);
        while (true) {
            int xInterval = ball.getxInterval();
            ball.setX(ball.getX() + xInterval);
            if ((ball.getX() < 0 && ball.getxInterval() < 0) ||
                    ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 - Ball.SIZE && ball.getxInterval() > 0) {
                xInterval = -xInterval;
            }
            int yInterval = ball.getxInterval();
            ball.setY(ball.getY() + yInterval);
            if ((ball.getY() < Ball.SIZE && ball.getyInterval() < 0) ||
                    ball.getY() + Ball.SIZE > BallFrame.HEIGHT - 40 && ball.getyInterval() > 0) {
                yInterval = -yInterval;
            }
            ball.setIntervals(xInterval, yInterval);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) { }
        }
    }
}
