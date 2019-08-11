package main.java.org.patterns.generatingPatterns.prototype;


import java.awt.*;

public class BMW extends Car {

    public BMW(BMW bmw) {
        super(bmw);
    }

    public BMW(String bmw, int i, Color color, Engine engine) {
        super(bmw, i, color, engine);
    }


    @Override

    public Object clone() {
        return new BMW(this);
    }


}
