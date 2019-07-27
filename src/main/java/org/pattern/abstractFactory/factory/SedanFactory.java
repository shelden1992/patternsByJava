package main.java.org.pattern.abstractFactory.factory;

import main.java.org.pattern.abstractFactory.*;

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
