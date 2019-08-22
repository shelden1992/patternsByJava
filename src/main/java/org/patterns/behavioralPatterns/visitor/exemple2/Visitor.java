package main.java.org.patterns.behavioralPatterns.visitor.exemple2;

public interface Visitor {
    void visitor(HtmlPage element);

    void visitor(PapperPage papperPage);
}
