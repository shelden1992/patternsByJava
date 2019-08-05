package main.java.org.pattern.generatingPatterns.prototype.typeCopy.deepCopy.serializable;

import main.java.org.pattern.generatingPatterns.prototype.typeCopy.deepCopy.copyConstructor.Car;

import java.awt.*;
import java.io.*;
import java.util.Objects;

public class CarSerial implements Cloneable, Serializable {
    public String brand;
    public int id;
    public Color color;
    public   Engine engine;

    public CarSerial(String brand, int id, Color color, Engine engine) {
        this.brand=brand;
        this.id=id;
        this.color=color;
        this.engine=engine;
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("CarSerial{");
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
        CarSerial carSerial=(CarSerial) o;
        return id == carSerial.id &&
                Objects.equals(brand, carSerial.brand) &&
                Objects.equals(color, carSerial.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, id, color);
    }

    public CarSerial cloneSerializable() {
        try (ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);) {

            objectOutputStream.writeObject(this);

            try (ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

                 ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);) {

                return (CarSerial) objectInputStream.readObject();
            }


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car(this.brand, this.id, this.color);
    }


}




