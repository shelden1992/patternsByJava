package main.java.org.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    private List<Shape> list = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        list.forEach(f -> f.draw(fillColor));
    }

    public void add(Shape shape) {
        list.add(shape);
    }

    public void remove(Shape shape) {
        if (list.contains(shape)) {
            list.remove(shape);
        } else throw new IllegalArgumentException();
    }
    public void clear(){
        System.out.println("All clear");
        list.clear();
    }
}
