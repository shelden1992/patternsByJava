package main.java.org.patterns.generatingPatterns.factoryMethod;

public class BMWFactory extends FactoryClass {
    @Override
    public Car getCar(String name, String mark, int id, int volumeEngine) {
        return new BMW(name, mark, id,volumeEngine);
    }
}
