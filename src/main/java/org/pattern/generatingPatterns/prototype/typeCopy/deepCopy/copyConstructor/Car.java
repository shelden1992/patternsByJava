package main.java.org.pattern.generatingPatterns.prototype.typeCopy.deepCopy.copyConstructor;

import java.awt.*;
import java.util.Objects;

public class Car {
    public String brand;
    public int id;
    public Color color;

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Car{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", id=").append(id);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

    public Car(String brand, int id, Color color) {
        this.brand=brand;
        this.id=id;
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

    public Car(Car that) {
        this(that.brand, that.id, that.color);


    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car(this.brand, this.id, this.color);
    }
}

