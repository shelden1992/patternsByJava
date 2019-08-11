package main.java.org.patterns.structural.adapter.exemple1.ObjectAdapter;

import main.java.org.patterns.structural.adapter.exemple1.Socket;
import main.java.org.patterns.structural.adapter.exemple1.SocketAdapter;
import main.java.org.patterns.structural.adapter.exemple1.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket socket=new Socket();


    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convectorVolt(socket.getVolt(), 10);
    }

    private Volt convectorVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }

    @Override
    public Volt get3Volt() {
        return convectorVolt(socket.getVolt(), 40);
    }
}
