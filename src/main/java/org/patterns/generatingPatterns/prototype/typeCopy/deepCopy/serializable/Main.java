package main.java.org.patterns.generatingPatterns.prototype.typeCopy.deepCopy.serializable;

import java.awt.*;

public class Main {
    public static void main(String[] args) {


        CarSerial bmw=new CarSerial("BMWdecorator", 123, new Color(2134), new Engine(2));
        CarSerial carSerial=bmw.cloneSerializable();

        System.out.println(bmw);
        System.out.println(carSerial);
        System.out.println(bmw.equals(carSerial));

        bmw.engine.values = 10;
        System.out.println(bmw);
        System.out.println(carSerial);
    }
}
