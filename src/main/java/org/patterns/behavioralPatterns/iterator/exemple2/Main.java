package main.java.org.patterns.behavioralPatterns.iterator.exemple2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection collection = new CollectionImpl();
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        collection.add(new Notification("Hi"));
        collection.add(new Notification("Whats you name?"));
        collection.add(new Notification("My name is Den!"));
        collection.add(new Notification("Wherry well"));


        IteratorNotification iterator = collection.iterator();
        Iterator<String> iterator1 = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
