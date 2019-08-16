package main.java.org.patterns.structuralPatterns.adapter.exemple2;

public class Car implements KmHSpeed  {
    private Double speed;

    public Double getSpeed() {
        return speed;
    }

    public Car(Double speed) {
        this.speed=speed;
    }

    public void setSpeed(Double speed) {
        this.speed=speed;
    }
}
