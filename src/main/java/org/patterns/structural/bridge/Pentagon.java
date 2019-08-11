package main.java.org.patterns.structural.bridge;

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