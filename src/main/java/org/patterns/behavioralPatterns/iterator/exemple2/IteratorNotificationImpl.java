package main.java.org.patterns.behavioralPatterns.iterator.exemple2;

import java.util.List;

public class IteratorNotificationImpl implements IteratorNotification {
    private List<Notification> notificationList;
    private int count = 0;

    public IteratorNotificationImpl(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        if (count >= notificationList.size() || notificationList.get(count) == null) {
            return false;
        }
        return true;

    }

    @Override
    public Notification next() {
        Notification notification = notificationList.get(count);
        count++;

        return notification;

    }
}
