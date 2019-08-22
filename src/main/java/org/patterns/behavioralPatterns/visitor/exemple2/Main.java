package main.java.org.patterns.behavioralPatterns.visitor.exemple2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Element[] elements = {
                new HtmlPage(),
                new PapperPage()};
        Visitor visitor = new VisitorImpl();
        Arrays.stream(elements).forEach(f -> f.accept(visitor));

    }
}
