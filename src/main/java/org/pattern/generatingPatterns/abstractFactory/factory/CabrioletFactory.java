package main.java.org.pattern.generatingPatterns.abstractFactory.factory;

import main.java.org.pattern.generatingPatterns.abstractFactory.*;

public class CabrioletFactory  extends AbstractFactory{

    @Override
  public BMW creatBMW() {
        return new CabrioBMW();
    }

    @Override
    public Volkswagen creatVW() {
        return new CabrioVW();
    }

    @Override
    public Mersedes creatMersedes() {
        return new CabriobMersedes();
    }
}
