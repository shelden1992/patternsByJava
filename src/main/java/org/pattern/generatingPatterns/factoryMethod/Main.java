package main.java.org.pattern.generatingPatterns.factoryMethod;

public class Main {
    public static void main(String[] args) {
        FactoryClass factoryClass1 =new BMWFactory();
        FactoryClass factoryClass2 =new MersedesFactory();
        Car car=factoryClass1.getCar("BMW","z-4", 1212334, 5);
        Car  car1 = factoryClass2.getCar("","",1,1);

        System.out.println( car.getClass());
        System.out.println( car1.getClass());
    }
}
