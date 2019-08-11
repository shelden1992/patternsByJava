package main.java.org.patterns.structural.bridge;



public class RedColor implements Color {
    @Override
    public void draw() {
        System.out.println("red drawing");
    }
}
