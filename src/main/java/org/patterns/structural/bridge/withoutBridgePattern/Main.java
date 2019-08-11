package main.java.org.patterns.structural.bridge.withoutBridgePattern;

public class Main{
    public static void main(String[] args) {
        new TriangleGreen().draw();
        new GreenColor(new Triangle()).draw();
    }
}

