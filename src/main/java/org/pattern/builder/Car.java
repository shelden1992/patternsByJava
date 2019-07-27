package main.java.org.pattern.builder;

import java.awt.*;
import java.util.Map;

public class Car {
    private String brand;
    private int valueEngine;
    private String typeTire;
    private Color color;
    private int id;
    private boolean haveSpoiler;
    private boolean haveLedLights;
    private boolean climateControl;
    private Map<String, Integer> nameAudioSystemAndNumberSpeakers;

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Car{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", valueEngine=").append(valueEngine);
        sb.append(", typeTire='").append(typeTire).append('\'');
        sb.append(", color=").append(color);
        sb.append(", id=").append(id);
        sb.append(", haveSpoiler=").append(haveSpoiler);
        sb.append(", haveLedLights=").append(haveLedLights);
        sb.append(", climateControl=").append(climateControl);
        sb.append(", nameAudioSystemAndNumberSpeakers=").append(nameAudioSystemAndNumberSpeakers);
        sb.append('}');
        return sb.toString();
    }

    /**
     * builder like setter, but x
     */
    public static class Builder {


        Car car=new Car();

        public Builder carWithSpoiler(boolean haveSpoiler) {
            car.haveSpoiler=haveSpoiler;
            return this;

        }

        public Builder carWithLedLights(boolean haveLedLights) {
            car.haveLedLights=haveLedLights;
            return this;
        }

        public Builder carWithColor(Color color) {
            car.color=color;
            return this;
        }

        public Builder withClimatControl(boolean climatControl) {
            car.climateControl=climatControl;
            return this;
        }

        public Builder withBrand(String brand) {
            car.brand=brand;
            return this;
        }

        public Builder typeTire(String typeTire) {
            car.typeTire=typeTire;
            return this;
        }

        public Builder valueEngine(int valueEngine) {
            car.valueEngine=valueEngine;
            return this;
        }
 public Builder id(int id) {
            car.id=id;
            return this;
        }

        public Builder nameAudioSystemAndNumberSpeakers(Map<String, Integer> nameAudioSystemAndNumberSpeakers) {
            car.nameAudioSystemAndNumberSpeakers=nameAudioSystemAndNumberSpeakers;
            return this;
        }


    }

    public Car(String brand, int valueEngine, String typeTire, Color color, int id, boolean haveSpoiler, boolean haveLedLights, boolean climateControl, Map<String, Integer> nameAudioSystemAndNumberSpeakers) {
        this.brand=brand;
        this.valueEngine=valueEngine;
        this.typeTire=typeTire;
        this.color=color;
        this.id=id;
        this.haveSpoiler=haveSpoiler;
        this.haveLedLights=haveLedLights;
        this.climateControl=climateControl;
        this.nameAudioSystemAndNumberSpeakers=nameAudioSystemAndNumberSpeakers;

    }

    public Car(Color color, boolean haveSpoiler) {
        this.color=color;
        this.haveSpoiler=haveSpoiler;
    }

    public Car() {
    }

    public Car(int id) {
        this.id=id;
    }


}
