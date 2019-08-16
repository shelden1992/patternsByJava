package main.java.org.patterns.structuralPatterns.flyweight.exemple1;

import java.util.HashMap;

public class CarFactory {
    private static HashMap<RaceCarType, RaceCar> flyweights = new HashMap<>();


    public static HashMap<RaceCarType, RaceCar> getFlyweights() {
        return flyweights;
    }

    public static RaceCar getRaceCar(RaceCarType key) {
        if (flyweights.containsKey(key)) {

            return flyweights.get(key);
        }
        RaceCar raceCar;

        switch (key) {
            case MIDGET_CAR:
                raceCar = new FlyweightMidgetCar();
                raceCar.horsepower = 100;
                raceCar.speed = 150;
                raceCar.nane = "Fiat";
                break;
            case SPRING_CAR:
                raceCar = new FlyweightSprintCar();
                raceCar.horsepower = 120;
                raceCar.speed = 165;
                raceCar.nane = "Dodge";
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + key);
        }
        flyweights.put(key, raceCar);
        return raceCar;

    }


}
