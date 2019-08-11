package main.java.org.patterns.structural.adapter.exemple2;

public class Bicycle implements KmHSpeed  {
    private Double speed;

    public Bicycle(Double speed) {
        this.speed=speed;
    }

    public Double getSpeed() {
        return speed;
    }
}
