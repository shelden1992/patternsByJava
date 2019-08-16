package main.java.org.patterns.structuralPatterns.decorator.exemple4;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.print("drawing Rectangle");
    }

    @Override
    public void resize() {
        System.out.print("resizing Rectangle");

    }

    @Override
    public void move() {
        System.out.print("moving Rectangle");

    }

    @Override
    public void description() {
        System.out.print("Rectangle");

    }
}
