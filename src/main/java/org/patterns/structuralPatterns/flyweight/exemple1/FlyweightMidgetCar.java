package main.java.org.patterns.structuralPatterns.flyweight.exemple1;

public class FlyweightMidgetCar extends RaceCar {
    public static int getNum() {
        return num;
    }

    private static int num;

    public FlyweightMidgetCar() {
        num++;
    }

    @Override
    void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.printf("Car move to %s newX and %s newY \n", newX, newY);

    }
}
