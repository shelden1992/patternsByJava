package main.java.org.patterns.structuralPatterns.adapter.exemple1;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
