package main.java.org.patterns.structuralPatterns.flyweight.exemple1;

import java.util.Random;

/**
 * Intrinsic data is the data that makes this object instance unique. Meanwhile, extrinsic data is information that can be passed in through arguments
 * The Flyweight interface declares methods which flyweight instances can receive and use extrinsic data
 * not change = INTRINSIC data;
 * change = EXTRINSIC data;
 * Many similar objects are used and the storage cost is high
 * The majority of each object's state data can be made extrinsic
 * A few shared objects would easily replace many unshared objects
 * The identity of each object does not matter
 */
public class Main {

    private int currentX = 0;
    private int currentY = 0;

    public static void main(String[] args) {

        RaceCarClient[] raceCarClients = new RaceCarClient[10];
        for (int i = 0; i < 10; i++) {
            raceCarClients[i] = new RaceCarClient(RaceCarType.MIDGET_CAR);

        }
        for (RaceCarClient raceCarClient : raceCarClients) {
            raceCarClient.moveCar(new Random().nextInt(30), new Random().nextInt(3000));

        }
        System.out.println(FlyweightMidgetCar.getNum());



    }


}

