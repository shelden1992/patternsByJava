package main.java.org.patterns.structuralPatterns.bridge.exemple1;


//              ----Shape---                        Color
//             /            \                       /   \
//     Pentagon(Color)   Triangle(Color)           Blue   Red

public class Main {
    public static void main(String[] args) {
        new Triangle(new GreenColor()).draw();
        new Triangle(new RedColor()).draw();
    }

}
