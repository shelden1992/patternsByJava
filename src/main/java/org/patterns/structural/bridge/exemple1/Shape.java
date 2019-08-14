package main.java.org.patterns.structural.bridge.exemple1;

public abstract class Shape {
    //Composition - implementor
    protected Color color;

    public Color getColor() {
        return color;
    }



    public Shape(Color color) {
        this.color=color;
    }
    public abstract void draw();

}
