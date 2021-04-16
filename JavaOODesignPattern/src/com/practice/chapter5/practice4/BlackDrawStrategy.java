package com.practice.chapter5.practice4;

import java.awt.*;

public class BlackDrawStrategy extends DrawStrategy {
    @Override
    public void draw(Ball ball) {
        ball.setColor(Color.black);
    }
}
