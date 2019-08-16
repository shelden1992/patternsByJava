package main.java.org.patterns.behavioralPatterns.iterator.exemple2;

public class Main {
    public static void main(String[] args) {
        Collection collection = new CollectionImpl();
        collection.add(new Notification("Hi"));
        collection.add(new Notification("Whats you name?"));
        collection.add(new Notification("My name is Den!"));
        collection.add(new Notification("Wherry well"));


        IteratorNotification iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
