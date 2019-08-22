package main.java.org.patterns.behavioralPatterns.visitor.exemple1;

public interface ItemElement {
    int getPrisePerKg();
    int getNumbers();
    int accept (Visitor visitor);


}
