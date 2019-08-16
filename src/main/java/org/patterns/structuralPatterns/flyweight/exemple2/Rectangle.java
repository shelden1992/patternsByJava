package main.java.org.patterns.structuralPatterns.flyweight.exemple2;

import java.awt.*;

public class Rectangle implements Shape {
    boolean fill;

    public Rectangle(boolean fill) {
        this.fill = fill;
    }

    @Override
    public void draw(Graphics square, int x, int y, int width, int height, Color color) {
        square.setColor(color);
        square.drawRect(x, y, width, height);
        if (fill) {
            square.fillRect(x, y, width, height);
        }


    }
}
