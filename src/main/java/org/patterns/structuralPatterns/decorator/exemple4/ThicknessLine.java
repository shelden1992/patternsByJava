package main.java.org.patterns.structuralPatterns.decorator.exemple4;

public class ThicknessLine extends ShapeDecorator {
    protected Lines line;

    public ThicknessLine(Shape shape, Lines line) {
        super(shape);
        this.line = line;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.print("line change to " + line.name());


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
