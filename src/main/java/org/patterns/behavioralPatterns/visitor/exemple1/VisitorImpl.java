package main.java.org.patterns.behavioralPatterns.visitor.exemple1;

public class VisitorImpl implements Visitor {
    @Override
    public int visitElements(Book itemElement1) {
        return itemElement1.getPrisePerKg() * itemElement1.getNumbers();
    }

    @Override
    public int visitElements(Food itemElement2) {
        return itemElement2.getPrisePerKg() * itemElement2.getPrisePerKg();
    }
}
