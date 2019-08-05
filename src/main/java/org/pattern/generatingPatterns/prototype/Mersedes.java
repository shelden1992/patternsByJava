package main.java.org.pattern.generatingPatterns.prototype;

import java.awt.*;

public class Mersedes extends Car {


    public Mersedes(Mersedes mersedes) {
        super(mersedes);
    }

    public Mersedes(String mers, int i, Color color, Engine engine) {
        super(mers, i,color,engine);
    }

    @Override
    public Object clone() {
        return new Mersedes(this);
    }


}
