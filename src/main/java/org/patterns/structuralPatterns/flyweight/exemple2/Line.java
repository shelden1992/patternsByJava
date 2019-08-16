package main.java.org.patterns.structuralPatterns.flyweight.exemple2;

import java.awt.*;

public class Line implements Shape {
    private boolean fill;
    private static int num;

    public Line(boolean fill) {
        System.out.println("Creating line with fill " + fill);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x, int y, int width, int height, Color color) {
        line.setColor(color);
        line.drawLine(x, y, width, height);
        if (fill) {
            line.fillRect(x, y, width, height);
        }


    }
}
