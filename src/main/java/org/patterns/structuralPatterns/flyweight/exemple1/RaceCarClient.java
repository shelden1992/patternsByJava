package main.java.org.patterns.structuralPatterns.flyweight.exemple1;

public class RaceCarClient {
    private RaceCar raceCar;
    private int currentX = 0;
    private int currentY = 0;

    public RaceCarClient(RaceCarType raceCar) {
        this.raceCar = CarFactory.getRaceCar(raceCar);
    }

    public void moveCar(int newX, int newY) {
        raceCar.moveCar(currentX, currentY, newX, newY);
        currentX = newX;
        currentY = newY;
    }
}
