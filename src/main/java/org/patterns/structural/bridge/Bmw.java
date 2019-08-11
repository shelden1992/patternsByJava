package main.java.org.patterns.structural.bridge;

import main.java.org.patterns.structural.bridge.Color;

public class Bmw extends Car {


    public Bmw(Color color) {
        super(color);
    }

    @Override
    void draw() {
    color.draw();
        System.out.println("bmw");
    }
}
