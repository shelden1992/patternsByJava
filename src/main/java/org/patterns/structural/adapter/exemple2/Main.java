package main.java.org.patterns.structural.adapter.exemple2;

import main.java.org.patterns.structural.adapter.exemple2.ObjectAdapter.AdapterKmToMPHImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car =new Car(150.0);
        AdapterKmToMPH adapterKmToMPH = new AdapterKmToMPHImpl(car);
        System.out.println(car.getSpeed());
        System.out.println(adapterKmToMPH.getSpeed());
        Bicycle bicycle = new Bicycle(15.0);
        Double speed=new AdapterKmToMPHImpl(bicycle).getSpeed();
        System.out.println(speed);



    }

}
