package main.java.org.patterns.structural.adapter.exemple1;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
