package main.java.org.patterns.generatingPatterns.prototype;

import java.awt.*;

public class Mercedes extends Car {


    public Mercedes(Mercedes mercedes) {
        super(mercedes);
    }

    public Mercedes(String mers, int i, Color color, Engine engine) {
        super(mers, i,color,engine);
    }

    @Override
    public Object clone() {
        return new Mercedes(this);
    }


}
