package main.java.org.pattern.structural.adapter.ClassAdapter;

import main.java.org.pattern.structural.adapter.Socket;
import main.java.org.pattern.structural.adapter.SocketAdapter;
import main.java.org.pattern.structural.adapter.Volt;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt(),10);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts()/i);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(getVolt(),40);
    }
}
