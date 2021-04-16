package com.practice.chapter5.practice5;

import javax.swing.*;
import java.awt.*;

public class Running extends JFrame {
    private Field field;

    public Running() {
        super("Running");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        field = new Field();

        add(field, BorderLayout.CENTER);

        setSize(195, 195);
        setVisible(true);

        Thread th = new Thread(field);
        th.start();
    }
}
