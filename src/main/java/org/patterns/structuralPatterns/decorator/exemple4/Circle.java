package main.java.org.patterns.structuralPatterns.decorator.exemple4;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Circle");

    }

    @Override
    public void move() {
        System.out.println("Moving Circle");

    }

    @Override
    public void description() {
        System.out.println("Circle");

    }
}
