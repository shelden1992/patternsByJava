package main.java.org.patterns.structural.bridge.withoutBridgePattern;

public class RedColor implements Color {
    @Override
    public void draw() {
        System.out.println("red");
    }
}
