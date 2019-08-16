package main.java.org.patterns.structuralPatterns.adapter.exemple3;


public class Phone  {


    public int charge (EuroSocket euroSocket){
        return (int) (euroSocket.getVolt()*0.356);
    }
}
