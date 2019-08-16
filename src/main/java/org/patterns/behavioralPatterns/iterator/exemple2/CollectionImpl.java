package main.java.org.patterns.behavioralPatterns.iterator.exemple2;

import java.util.ArrayList;
import java.util.List;

public class CollectionImpl implements Collection {
    private List<Notification> notificationList;

    public CollectionImpl() {
        this.notificationList = new ArrayList<>();
    }

    @Override
    public void add(Notification notification) {
        notificationList.add(notification);

    }

    @Override
    public void remove(Notification notification) {
        notificationList.remove(notification);

    }

    @Override
    public IteratorNotification iterator() {
        return new IteratorNotificationImpl(notificationList);
    }
}
