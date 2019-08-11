package main.java.org.patterns.generatingPatterns.abstractFactory;

import main.java.org.patterns.generatingPatterns.abstractFactory.factory.*;

public class Main {
    public static void main(String[] args) {
        AbstractFactory crossoverFactory =new CrossoverFactory();
        AbstractFactory cabrioletFact =new CabrioletFactory();
        AbstractFactory sedanFactory =new SedanFactory();

        BMW bmw1=cabrioletFact.creatBMW();
        Mersedes mersedes1=cabrioletFact.creatMersedes();
        Volkswagen volkswagen1=cabrioletFact.creatVW();

        System.out.println(bmw1.getClass().getSimpleName());
        System.out.println(mersedes1.getClass().getSimpleName());
        System.out.println(volkswagen1.getClass().getSimpleName());

        Mersedes mersedes=sedanFactory.creatMersedes();
        Volkswagen volkswagen=sedanFactory.creatVW();
        BMW bmw=sedanFactory.creatBMW();

        System.out.println(mersedes.getClass());
        System.out.println(volkswagen.getClass());

        System.out.println(bmw.getClass());

    }


}
