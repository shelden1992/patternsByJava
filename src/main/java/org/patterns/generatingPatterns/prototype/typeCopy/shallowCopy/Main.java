package main.java.org.patterns.generatingPatterns.prototype.typeCopy.shallowCopy;


import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car bmw=new Car("BMWdecorator", 123, new Color(2134));
        Car car=new Car(bmw.getBrand(), bmw.getId(), bmw.getColor());







    }
}
