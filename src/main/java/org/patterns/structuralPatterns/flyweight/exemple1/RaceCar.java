package main.java.org.patterns.structuralPatterns.flyweight.exemple1;


//(it's Flyweight)
abstract class RaceCar {
    //Intrinsic state
    String nane;
    int speed;
    int horsepower;

    // Extrinsic
    abstract void moveCar(int currentX, int currentY, int newX, int newY);
}
