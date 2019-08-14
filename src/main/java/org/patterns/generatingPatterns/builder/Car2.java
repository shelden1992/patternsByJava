package main.java.org.patterns.generatingPatterns.builder;

import java.awt.*;
import java.util.Map;

public class Car2 {
    private String brand;
    private int valueEngine;
    private String typeTire;
    private Color color;
    private int id;
    private boolean haveSpoiler;
    private boolean haveLedLights;
    private boolean climateControl;
    private Map<String, Integer> nameAudioSystemAndNumberSpeakers;

    public Car2(String brand, int valueEngine, String typeTire, Color color, int id, boolean haveSpoiler, boolean haveLedLights, boolean climateControl, Map<String, Integer> nameAudioSystemAndNumberSpeakers) {
        this.brand = brand;
        this.valueEngine = valueEngine;
        this.typeTire = typeTire;
        this.color = color;
        this.id = id;
        this.haveSpoiler = haveSpoiler;
        this.haveLedLights = haveLedLights;
        this.climateControl = climateControl;
        this.nameAudioSystemAndNumberSpeakers = nameAudioSystemAndNumberSpeakers;

    }


    public Car2(Color color, boolean haveSpoiler) {
        this.color = color;
        this.haveSpoiler = haveSpoiler;
    }

    public Car2() {
    }

    public Car2(int id) {
        this.id = id;
    }

    public static Builder newBuilder() {
        return new Car2().new Builder();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
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

    public class Builder {


        public Builder carWithSpoiler(boolean haveSpoiler) {
            Car2.this.haveSpoiler = haveSpoiler;
            return this;

        }

        public Builder carWithLedLights(boolean haveLedLights) {
            Car2.this.haveLedLights = haveLedLights;
            return this;
        }

        public Builder carWithColor(Color color) {
            Car2.this.color = color;
            return this;
        }

        public Builder withClimatControl(boolean climatControl) {
            Car2.this.climateControl = climatControl;
            return this;
        }

        public Builder withBrand(String brand) {
            Car2.this.brand = brand;
            return this;
        }

        public Builder typeTire(String typeTire) {
            Car2.this.typeTire = typeTire;
            return this;
        }

        public Builder valueEngine(int valueEngine) {
            Car2.this.valueEngine = valueEngine;
            return this;
        }

        public Builder id(int id) {
            Car2.this.id = id;
            return this;
        }

        public Builder nameAudioSystemAndNumberSpeakers(Map<String, Integer> nameAudioSystemAndNumberSpeakers) {
            Car2.this.nameAudioSystemAndNumberSpeakers = nameAudioSystemAndNumberSpeakers;
            return this;
        }

        public Car2 builder() {
            return Car2.this;
        }


    }

}
