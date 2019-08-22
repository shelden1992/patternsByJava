package main.java.org.patterns.behavioralPatterns.observer;

import java.util.*;

public class MyTopic implements Subject {
    private static MyTopic myTopic = new MyTopic();
    private final Object MUTEX = new Object();
    private boolean change;
    private List<Observer> observerList;
    private String message;

    private MyTopic() {
        this.observerList = new ArrayList<>();
    }

    public static MyTopic getInstance() {
        return myTopic;
    }

    @Override
    public void register(Observer... obj) {
        if (obj == null) {
            throw new NullPointerException("Null observe");
        }
        synchronized (MUTEX) {
            observerList.addAll(Arrays.asList(obj));

        }

    }

    @Override
    public void unregister(Observer obj) {
        if (!observerList.contains(obj)) {
            throw new NullPointerException("Null observe");
        }
        synchronized (MUTEX) {
            observerList.remove(obj);
        }

    }

    @Override
    public void notificationObserver() {
        List<Observer> localList;
        synchronized (MUTEX) {
            if (!change) {
                return;
            }

            localList = new ArrayList(this.observerList);
            this.change = false;

        }
        localList.forEach(Observer::update);

    }

    @Override
    public String getUpdate(Observer obj) {
        return this.message;


    }

    public void postMessage(String msg) {
        System.out.println("Send message = " + msg);
        this.message = msg;
        this.change = true;
        notificationObserver();
    }
}
