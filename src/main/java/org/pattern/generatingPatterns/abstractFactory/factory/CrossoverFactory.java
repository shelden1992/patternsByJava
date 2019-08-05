package main.java.org.pattern.generatingPatterns.abstractFactory.factory;

import main.java.org.pattern.generatingPatterns.abstractFactory.*;

public class CrossoverFactory extends AbstractFactory {
    @Override
   public BMW creatBMW() {
        return new CrossoverBMW();
    }

    @Override
    public Volkswagen creatVW() {
        return new CrossoverVW();
    }

    @Override
    public Mersedes creatMersedes() {
        return new CrossoverMersedes();
    }
}
