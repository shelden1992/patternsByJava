package main.java.org.pattern.generatingPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Database instance=Database.getInstance();
        System.out.println(instance.hashCode());
        Database instance1=Database.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance==instance1);
        System.out.println(instance.equals(instance1));

    }
}
