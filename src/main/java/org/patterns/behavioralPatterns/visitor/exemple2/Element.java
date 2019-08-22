package main.java.org.patterns.behavioralPatterns.visitor.exemple2;

public interface Element {
    void print();
   void accept(Visitor visitor);
}
