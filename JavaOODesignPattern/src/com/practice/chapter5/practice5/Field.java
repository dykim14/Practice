package com.practice.chapter5.practice5;

import javax.swing.*;
import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Field extends JPanel implements Runnable {
    private JLabel lbl;
    private String[] walkingImage = { "walk1.gif", "walk2.gif" };

    public Field() {
        setLayout(new BorderLayout());
        lbl = new JLabel();
        Path relativePath = Paths.get("");
        String path = relativePath.toAbsolutePath().toString();
        System.out.println("Working Directory = " + path);
        lbl.setIcon(new ImageIcon("./JavaOODesignPattern/src/walk1.gif"));
        add(lbl, BorderLayout.CENTER);
    }

    @Override
    public void run() {
        while (true) {
            String[] path = walkingImage;
            for (String p : path) {
                lbl.setIcon(new ImageIcon("./JavaOODesignPattern/src/" + p));
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) { }
            }
        }
    }
}
