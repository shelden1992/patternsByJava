package main.java.org.patterns.structuralPatterns.flyweight.exemple2;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactor {
    private static Map<ShapeType, Shape> shapes = new HashMap<>();
    private static Shape shape;

    private ShapeFactor() {
    }

    public static Shape getShape(ShapeType shapeType) {
        if (shapes.containsKey(shapeType)) {
            return shapes.get(shapeType);
        }
        switch (shapeType) {
            case OVAL_NOTFILL:
                shape = new Oval(false);
                break;
            case LINE:
                shape = new Line(true);
                break;
            case OVAL_FILL:
                shape = new Oval(true);
                case RECTANGLE:
                shape = new Rectangle(true);
        }
        shapes.put(shapeType, shape);
        return shape;

    }
}
