package main.java.org.patterns.structuralPatterns.bridge.exemple1;

public class Pentagon extends Shape {
    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw pentagon");
        color.draw();
    }

}
