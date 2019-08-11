package main.java.org.patterns.generatingPatterns.prototype.typeCopy.shallowCopy.copyConstructor;

import java.awt.*;
import java.util.Objects;

public class Car {
    public String brand;
    public int id;
    public Color color;

    public Car(String brand, int id, Color color, Engine engine) {
        this.brand=brand;
        this.id=id;
        this.color=color;
        this.engine=engine;
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

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Car{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", id=").append(id);
        sb.append(", color=").append(color);
        sb.append(", engine=").append(engine);
        sb.append('}');
        return sb.toString();
    }

    Car(Car that) {
        this(that.brand, that.id, that.color, that.engine);
    }

    public Engine engine;
}
