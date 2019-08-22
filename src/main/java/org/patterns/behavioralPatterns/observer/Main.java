package main.java.org.patterns.behavioralPatterns.observer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Subject subject = MyTopic.getInstance();
        Observer den = new TopicSubscriber("Den");
        Observer valera = new TopicSubscriber("Valera");
        Arrays.asList(den, valera).forEach(o -> o.setSubject(subject));
        subject.register(den, valera);
        ((MyTopic) subject).postMessage("Upadate some inform");
        subject.notificationObserver();

    }


}
