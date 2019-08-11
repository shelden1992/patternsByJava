package main.java.org.patterns.generatingPatterns.abstractFactory.factory;

import main.java.org.patterns.generatingPatterns.abstractFactory.*;

public class SedanFactory extends AbstractFactory {
    @Override
  public   BMW creatBMW() {
        return new SedanBMW();
    }

    @Override
    public Volkswagen creatVW() {
        return new SedanVW();
    }

    @Override
    public Mersedes creatMersedes() {
        return new SedanMersedec();
    }
}
