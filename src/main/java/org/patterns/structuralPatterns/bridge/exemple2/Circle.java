package main.java.org.patterns.structuralPatterns.bridge.exemple2;

public class Circle extends Shape {


    public Circle(  Color color) {
        super(  color);
    }


    @Override
    public void draw() {
        System.out.print("Circle ");
        color.draw();

    }
}
