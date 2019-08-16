package main.java.org.patterns.structuralPatterns.adapter.exemple3;

public class SimpleAmericanSocket implements AmericanSocket {
    @Override
    public int getVolt() {
        return 120;
    }
}
