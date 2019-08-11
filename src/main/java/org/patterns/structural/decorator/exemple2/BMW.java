package main.java.org.patterns.structural.decorator.exemple2;

public class BMW extends Decorator {
    public BMW(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("adding BMW function");
    }
}
