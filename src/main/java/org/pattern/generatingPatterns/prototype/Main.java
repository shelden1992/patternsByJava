package main.java.org.pattern.generatingPatterns.prototype;

import java.awt.*;
/**
 * The clone generally shares state with the object being cloned.
 * If that state is mutable, you don’t have two independent objects.
 * If you modify one, the other changes as well.
 * And all of a sudden, you get random behavior.
 *
 * – Josh Bloch
 * */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Mersedes mersedes=new Mersedes("Mers", 1212, new Color(1233), new Engine(2));
        BMW bmw=new BMW("BMW", 122, new Color(2132), new Engine(3));
        System.out.println(mersedes);
        System.out.println(bmw);
        Object clone=bmw.clone();
        System.out.println(clone);
        System.out.println(clone.equals(bmw));
        bmw.engine.values =100;
        System.out.println(bmw);
        System.out.println(clone);


    }


}