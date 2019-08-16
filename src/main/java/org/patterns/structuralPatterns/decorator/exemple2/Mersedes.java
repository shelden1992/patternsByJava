package main.java.org.patterns.structuralPatterns.decorator.exemple2;

public class Mersedes extends Decorator {
    public Mersedes(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("adding mersedes function");
    }
}
