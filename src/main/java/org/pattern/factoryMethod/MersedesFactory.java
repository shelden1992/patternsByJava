package main.java.org.pattern.factoryMethod;

public class MersedesFactory extends FactoryClass {
    @Override
    public Car getCar(String name, String mark, int id, int volumeEngine) {
        return new Mersedes(name, mark, id,volumeEngine);
    }
}
