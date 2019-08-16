package main.java.org.patterns.structuralPatterns.flyweight.exemple2;

import java.awt.*;

public class Oval implements Shape {
    private boolean fill;

    public Oval(boolean fill) {
        System.out.println("Creating oval with fill " + fill);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics oval, int x, int y, int width, int height, Color color) {
        oval.setColor(color);
        oval.drawOval(x, y, width, height);
        if (fill){
            oval.fillRect(x,y,width,height);
        }

    }
}
