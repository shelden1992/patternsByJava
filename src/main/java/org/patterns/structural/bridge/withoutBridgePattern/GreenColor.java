package main.java.org.patterns.structural.bridge.withoutBridgePattern;


public class GreenColor implements Color {
    public GreenColor(Shape shape) {
        this.shape=shape;
    }

    private Shape shape;
    @Override
    public void draw() {
        System.out.println( shape.getClass().getSimpleName() + "green");
    }
}
