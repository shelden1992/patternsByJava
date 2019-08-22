package main.java.org.patterns.behavioralPatterns.visitor.exemple2;

public class VisitorImpl implements Visitor {
    @Override
    public void visitor(HtmlPage element) {
        element.print();
    }

    @Override
    public void visitor(PapperPage papperPage) {
        papperPage.print();

    }
}
