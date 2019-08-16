package main.java.org.patterns.behavioralPatterns.iterator.exemple2;

public class Notification {
  private   String noficitation;

    public String getNoficitation() {
        return noficitation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Notification{");
        sb.append("noficitation='").append(noficitation).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setNoficitation(String noficitation) {
        this.noficitation = noficitation;
    }

    public Notification(String noficitation) {
        this.noficitation = noficitation;
    }
}
