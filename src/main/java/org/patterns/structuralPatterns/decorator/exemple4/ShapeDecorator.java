package main.java.org.patterns.structuralPatterns.decorator.exemple4;

public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }


}
