package main.java.org.patterns.structural.bridge.withoutBridgePattern;

public class TriangleRed extends Triangle {
    @Override
    public void draw() {
        super.draw();
        System.out.println("red");

    }
}
