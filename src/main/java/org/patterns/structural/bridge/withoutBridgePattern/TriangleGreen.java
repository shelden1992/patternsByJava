package main.java.org.patterns.structural.bridge.withoutBridgePattern;

public class TriangleGreen extends Triangle {
    @Override
    public void draw() {
        super.draw();
        System.out.println("green");
    }
}
