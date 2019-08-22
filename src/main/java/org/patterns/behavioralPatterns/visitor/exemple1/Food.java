package main.java.org.patterns.behavioralPatterns.visitor.exemple1;

public class Food implements ItemElement {
    private int prisePerKg;
    private int weight;
    private String name;

    public Food(int prisePerKg, int weight, String name) {
        this.prisePerKg = prisePerKg;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Food{");
        sb.append("prisePerKg=").append(prisePerKg);
        sb.append(", weight=").append(weight);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int getPrisePerKg() {
        return this.prisePerKg;
    }

    @Override
    public int getNumbers() {
        return this.weight;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visitElements(this);
    }
}
