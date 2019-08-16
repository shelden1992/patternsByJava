package main.java.org.patterns.structuralPatterns.bridge.exemple1.withoutBridgePattern;

public class TriangleRed extends Triangle {
    @Override
    public void draw() {
        super.draw();
        System.out.println("red");

    }
}
