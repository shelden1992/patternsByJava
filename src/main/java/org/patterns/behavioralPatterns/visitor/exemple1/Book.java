package main.java.org.patterns.behavioralPatterns.visitor.exemple1;

public class Book implements ItemElement {
    private int price;
    private int number;

    public Book(int price, int number, String name) {
        this.price = price;
        this.number = number;
        this.name = name;
    }

    private String name;

    @Override
    public int getPrisePerKg() {
        return this.price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("price=").append(price);
        sb.append(", number=").append(number);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int getNumbers() {
        return this.number;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visitElements(this);
    }

}
