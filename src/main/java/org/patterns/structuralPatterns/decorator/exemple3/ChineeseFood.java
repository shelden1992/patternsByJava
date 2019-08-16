package main.java.org.patterns.structuralPatterns.decorator.exemple3;

public class ChineeseFood extends FoodDecorator {
    public ChineeseFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " and prepare rise";
    }

    @Override
    public Double price() {
        return super.price() + 10.0;
    }
}
