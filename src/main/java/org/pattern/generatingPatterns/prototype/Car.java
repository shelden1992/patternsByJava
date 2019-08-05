package main.java.org.pattern.generatingPatterns.prototype;

import java.awt.*;
import java.util.Objects;

public abstract class Car implements Cloneable {

    public String brand;
    public int id;
    public Color color;
    public Engine engine;

    public Car(String brand, int id, Color color, Engine engine) {
        this.brand=brand;
        this.id=id;
        this.color=color;
        this.engine=engine;
    }
    public Object clone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder(this.getClass().getSimpleName());
        sb.append("brand='").append(brand).append('\'');
        sb.append(", id=").append(id);
        sb.append(", color=").append(color);
        sb.append(", engine=").append(engine);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car=(Car) o;
        return id == car.id &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(color, car.color) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, id, color, engine);
    }

    public Car  (Car whichWillClonned) {
        this.id = whichWillClonned.id;
        this.color = whichWillClonned.color;
        this.brand = whichWillClonned.brand;
        this.engine = whichWillClonned.engine;


    }

//    Car clone() throws CloneNotSupportedException;
}
