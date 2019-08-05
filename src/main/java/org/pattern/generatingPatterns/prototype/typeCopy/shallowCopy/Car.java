package main.java.org.pattern.generatingPatterns.prototype.typeCopy.shallowCopy;

import java.awt.*;
import java.util.Objects;

public class Car {
    private String brand;
    private int id;
    private Color color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand=brand;
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Car{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", id=").append(id);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color=color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car=(Car) o;
        return id == car.id &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, id, color);
    }

    public Car(String brand, int id, Color color) {
        this.brand=brand;
        this.id=id;
        this.color=color;
    }
}
