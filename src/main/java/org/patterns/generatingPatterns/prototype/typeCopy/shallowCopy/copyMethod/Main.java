package main.java.org.patterns.generatingPatterns.prototype.typeCopy.shallowCopy.copyMethod;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Engine engine=new Engine(3);
        Car car=new Car("BMWdecorator", 123, new Color(12312), engine);
        System.out.println(car);
        Car clone=(Car) car.clone();
        System.out.println(clone);
        System.out.println(car.equals(clone));
        clone.engine.values= 6;
        System.out.println(clone);
        System.out.println(car);


    }
}
