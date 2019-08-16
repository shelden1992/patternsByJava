package main.java.org.patterns.structuralPatterns.decorator.exemple4;


public class Main {
    public static void main(String[] args) {
//        ThicknessLine thicknessLine = new ThicknessLine(new Rectangle(), Lines.DASH_SPACE);
        new ColorDecorator(new ThicknessLine(new Rectangle(), Lines.DASH_SPACE), Colors.BLACK).draw();

//        thicknessLine.draw();

    }
}
