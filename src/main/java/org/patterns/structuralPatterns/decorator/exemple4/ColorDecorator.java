package main.java.org.patterns.structuralPatterns.decorator.exemple4;

public class ColorDecorator extends ShapeDecorator {
    private Colors color;

    public ColorDecorator(Shape shape, Colors color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {

        shape.draw();
        System.out.print(" to " + color.name());

    }

    @Override
    public void resize() {
        shape.resize();
    }

    @Override
    public void move() {
        shape.move();

    }

    @Override
    public void description() {
        shape.description();

    }
}
