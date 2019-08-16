package main.java.org.patterns.structuralPatterns.flyweight.exemple1;

public class FlyweightSprintCar extends RaceCar {
    private static int num;

    public FlyweightSprintCar() {
        num++;
    }

    @Override
    void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.printf("Car move to %s newX and %s newY \n", newX, newY);
    }
}
