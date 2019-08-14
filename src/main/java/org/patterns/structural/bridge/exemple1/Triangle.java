package main.java.org.patterns.structural.bridge.exemple1;

public class Triangle extends Shape {


    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw triangle");
        color.draw();
    }
}
