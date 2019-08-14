package main.java.org.patterns.generatingPatterns.builder;

import java.awt.*;
import java.util.HashMap;

public class Creator {
    public static void main(String[] args) {
        new Car("Bmw", 3, " ", new Color(1111), 1233331, true, true, true, new HashMap<>() {{
            put("Bose", 16);
        }});

        Car.Builder builder=new Car.Builder().withBrand("Bmw").valueEngine(3).carWithColor(new Color(600000063)).carWithSpoiler(true).carWithLedLights(true);
        System.out.println(builder.car);
        Car2.Builder mersedes = Car2.newBuilder().withBrand("Mercedes").valueEngine(2).carWithColor(new Color(2222)).carWithSpoiler(true).carWithLedLights(false);
        System.out.printf(String.valueOf(mersedes));
    }
}
