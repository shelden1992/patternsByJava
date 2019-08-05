package main.java.org.pattern.structural.adapter.ObjectAdapter;

import main.java.org.pattern.structural.adapter.Socket;
import main.java.org.pattern.structural.adapter.SocketAdapter;
import main.java.org.pattern.structural.adapter.Volt;

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
