package main.java.org.patterns.structural.decorator.exemple3;

public abstract class FoodDecorator implements Food {
    private Food food;

    public FoodDecorator(Food food) {
        this.food=food;
    }

    @Override
    public String prepareFood() {
        return food.prepareFood();
    }

    @Override
    public Double price() {
        return food.price();
    }
}
