package main.java.org.patterns.generatingPatterns.factoryMethod;

public class MersedesFactory extends FactoryClass {
    @Override
    public Car getCar(String name, String mark, int id, int volumeEngine) {
        return new Mercedes(name, mark, id,volumeEngine);
    }
}
