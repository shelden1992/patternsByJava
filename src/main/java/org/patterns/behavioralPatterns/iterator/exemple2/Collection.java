package main.java.org.patterns.behavioralPatterns.iterator.exemple2;

public interface Collection {
    void add(Notification notification);

    void remove(Notification notification);

    IteratorNotification iterator();

}
