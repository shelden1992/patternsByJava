package main.java.org.patterns.structuralPatterns.decorator.exemple3;

public class Main {

    public static void main(String[] args) {
        NonVegFood nonVegFood=new NonVegFood(new VegFood());
        System.out.println(nonVegFood.prepareFood() );
        System.out.println(nonVegFood.price());
        ChineeseFood chineeseFood=new ChineeseFood(new NonVegFood(new VegFood()));
        System.out.println(chineeseFood.prepareFood());
        System.out.println(chineeseFood.price());
    }


}
