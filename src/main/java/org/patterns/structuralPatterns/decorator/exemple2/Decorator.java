package main.java.org.patterns.structuralPatterns.decorator.exemple2;

public class Decorator extends BasicCar {
    private Car car;

    public Decorator(Car car) {
        this.car=car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
