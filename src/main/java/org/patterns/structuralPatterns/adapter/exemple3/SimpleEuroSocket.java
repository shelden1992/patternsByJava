package main.java.org.patterns.structuralPatterns.adapter.exemple3;

public class SimpleEuroSocket implements EuroSocket {



    @Override
    public int getVolt() {
        return 220;
    }
}
