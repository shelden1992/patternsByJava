package main.java.org.patterns.structuralPatterns.bridge.exemple1.withoutBridgePattern;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("triangle");
    }
}
