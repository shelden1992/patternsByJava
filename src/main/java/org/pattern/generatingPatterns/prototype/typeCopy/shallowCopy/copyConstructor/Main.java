package main.java.org.pattern.generatingPatterns.prototype.typeCopy.shallowCopy.copyConstructor;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car car =new Car("BMW", 123, new Color(2134234), new Engine(3));
        System.out.println(car);
        Car car1=new Car(car);
        System.out.println(car1);
        System.out.println(car.equals(car1));
        car.engine.values =12;
        System.out.println(car);
        System.out.println(car1);

    }




}
