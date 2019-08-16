package main.java.org.patterns.structuralPatterns.bridge.exemple2;

abstract class Shape {
    Color color;



    public Shape(  Color color) {
        this.color = color;
    }

    public abstract void draw();
}
