package main.java.org.patterns.structural.adapter.exemple1.ObjectAdapter;

import main.java.org.patterns.structural.adapter.exemple1.SocketAdapter;
import main.java.org.patterns.structural.adapter.exemple1.Volt;

public class Main {
    public static void main(String[] args) {
        SocketAdapter socketAdapter=new SocketObjectAdapterImpl();
        Volt volt3V=socketAdapter.get3Volt();
        Volt volt12V=socketAdapter.get12Volt();
        Volt volt120V=socketAdapter.get120Volt();
    }
}
