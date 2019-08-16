package main.java.org.patterns.structuralPatterns.bridge.exemple2;

public class Red implements Color {
    @Override
    public void draw() {
        System.out.println("drawing to red");
    }
}
