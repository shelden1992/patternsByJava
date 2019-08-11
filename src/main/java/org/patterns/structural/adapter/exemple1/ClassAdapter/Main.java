package main.java.org.patterns.structural.adapter.exemple1.ClassAdapter;

import main.java.org.patterns.structural.adapter.exemple1.SocketAdapter;
import main.java.org.patterns.structural.adapter.exemple1.Volt;

public class Main {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = socketAdapter.get3Volt();


        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();
        System.out.println(v3);
        System.out.println(v12);
        System.out.println(v120);

    }
}
