package main.java.org.patterns.structural.adapter.exemple1;

public class Volt {
    private int volts;

    public int getVolts() {
        return volts;
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Volt{");
        sb.append("volts=").append(volts);
        sb.append('}');
        return sb.toString();
    }

    public void setVolts(int volts) {
        this.volts=volts;
    }

    public Volt(int volts) {
        this.volts=volts;
    }
}
