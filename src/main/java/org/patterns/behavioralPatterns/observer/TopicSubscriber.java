package main.java.org.patterns.behavioralPatterns.observer;

public class TopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public TopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String update = topic.getUpdate(this);
        if (update == null) {
            System.out.println(name + " No new message");

        } else {
            System.out.println(name + " new message " + update);
        }

    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;


    }
}
