package main.java.org.patterns.structural.bridge.exemple2;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(new Yellow());
        shape.draw();
    }
}
