package main.java.org.patterns.structural.decorator.exemple3;

public class NonVegFood extends FoodDecorator {


    public NonVegFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " and prepare meat";
    }

    @Override
    public Double price() {
        return super.price()+120.0;
    }
}
