package main.java.org.patterns.structural.bridge;

import main.java.org.patterns.structural.bridge .Color;

public abstract class Car {
    protected Color color;

    public Car(Color color) {
        this.color=color;
    }

    abstract void draw();

}
