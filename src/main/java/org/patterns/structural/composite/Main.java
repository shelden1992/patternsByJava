package main.java.org.patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.add(new Triangle());
        drawing.add(new Circle());
        drawing.draw("red");

    }
}
