package main.java.org.patterns.structuralPatterns.adapter.exemple2.ObjectAdapter;

import main.java.org.patterns.structuralPatterns.adapter.exemple2.AdapterKmToMPH;
import main.java.org.patterns.structuralPatterns.adapter.exemple2.KmHSpeed;

public class AdapterKmToMPHImpl implements AdapterKmToMPH {
    public AdapterKmToMPHImpl(KmHSpeed car) {
        this.car=car;
    }

    // у адаптера есть тот класс, который мы будеим адаптировать (обьект).


   private KmHSpeed car;


    private Double speedConvector() {
        return car.getSpeed() / 1.609;
    }

    @Override
    public Double getSpeed() {
        return speedConvector();
    }
}
