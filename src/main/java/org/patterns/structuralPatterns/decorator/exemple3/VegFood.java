package main.java.org.patterns.structuralPatterns.decorator.exemple3;

public class VegFood implements Food {
    @Override
    public String prepareFood() {
        return "Wash, peel, chop";
    }

    @Override
    public Double price() {
        return 10.0;
    }
}
