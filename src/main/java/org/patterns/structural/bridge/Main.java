package main.java.org.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        new Triangle(new GreenColor()).draw();
        new Triangle(new RedColor()).draw();
        new Bmw(new RedColor()).draw();



    }
}
