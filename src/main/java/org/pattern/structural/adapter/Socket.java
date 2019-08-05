package main.java.org.pattern.structural.adapter;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
