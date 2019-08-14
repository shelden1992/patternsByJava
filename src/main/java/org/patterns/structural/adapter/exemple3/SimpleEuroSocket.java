package main.java.org.patterns.structural.adapter.exemple3;

public class SimpleEuroSocket implements EuroSocket {



    @Override
    public int getVolt() {
        return 220;
    }
}
