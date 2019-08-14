package main.java.org.patterns.structural.bridge.exemple2;

abstract class Shape {
    Color color;



    public Shape(  Color color) {
        this.color = color;
    }

    public abstract void draw();
}
