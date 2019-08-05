package main.java.org.pattern.generatingPatterns.factoryMethod;

public abstract class Car {
    String name;
    private String mark;
    private int id;
    private int volumeEngine;

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", mark='").append(mark).append('\'');
        sb.append(", id=").append(id);
        sb.append(", volumeEngine=").append(volumeEngine);
        sb.append('}');
        return sb.toString();
    }

    public Car(String name, String mark, int id, int volumeEngine) {
        this.name=name;
        this.mark=mark;
        this.id=id;
        this.volumeEngine=volumeEngine;
    }

    abstract void drive();

}
