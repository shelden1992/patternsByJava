package main.java.org.patterns.structuralPatterns.bridge.exemple1.withoutBridgePattern;

public class RedColor implements Color {
    @Override
    public void draw() {
        System.out.println("red");
    }
}
