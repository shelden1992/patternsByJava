package main.java.org.patterns.structural.decorator.exemple2;

public class Main {
    public static void main(String[] args) {
        BMW bmw=new BMW(new Decorator(new BasicCar()));
        bmw.assemble();
    }
}
