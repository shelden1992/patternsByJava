package main.java.org.pattern.generatingPatterns.prototype.typeCopy.deepCopy.copyConstructor;


import java.awt.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car bmw=new Car("BMW", 123, new Color(111222));
        System.out.println(bmw);
        Object cloneBmw=bmw.clone();
        System.out.println(cloneBmw);
        Car car=new Car(bmw);


        System.out.println(car);

        bmw.color = (new Color(100));

    }
}
