package main.java.org.patterns.behavioralPatterns.visitor.exemple1;

public class Main {
    public static void main(String[] args) {


        ItemElement[] itemElements = new ItemElement[]{
                new Book(120, 4, "Shantaram"),
                new Book(220, 1, "Think java"),
                new Food(20, 1, "Tomato")
        };

        System.out.println(allCost(itemElements));

    }

    private static int allCost(ItemElement[] itemElements) {
        Visitor visitor = new VisitorImpl();
        int sum = 0;
        for (ItemElement it : itemElements
        ) {
            sum += it.accept(visitor);


        }

        return sum;

    }


}
