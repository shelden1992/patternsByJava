package main.java.org.patterns.structural.bridge.exemple1.withoutBridgePattern;


//                                ----Shape---
//                           /                 \
//                     Rectangle              Circle
//                     /         \            /      \
//                BlueRectangle  RedRectangle BlueCircle RedCircle


public class Main {
    public static void main(String[] args) {
        new TriangleGreen().draw();
        new GreenColor(new Triangle()).draw();
    }
}

