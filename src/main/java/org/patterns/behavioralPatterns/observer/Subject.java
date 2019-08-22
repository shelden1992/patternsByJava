package main.java.org.patterns.behavioralPatterns.observer;

public interface Subject {
    public void register (Observer... obj);
    void unregister (Observer obj);
    void notificationObserver ();
    String getUpdate(Observer obj);


}
