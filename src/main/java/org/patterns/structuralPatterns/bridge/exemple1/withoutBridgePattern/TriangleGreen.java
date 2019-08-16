package main.java.org.patterns.structuralPatterns.bridge.exemple1.withoutBridgePattern;

public class TriangleGreen extends Triangle {
    @Override
    public void draw() {
        super.draw();
        System.out.println("green");
    }
}
