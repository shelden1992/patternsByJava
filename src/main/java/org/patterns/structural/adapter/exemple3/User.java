package main.java.org.patterns.structural.adapter.exemple3;

public class User {
    public static void main(String[] args) {
        Phone phone = new Phone();
//        AdapterToSocketUniversal adapterToSocketUniversal1 = AdapterToSocketUniversal.newBuilder(). putToAmericanSocket().build();
//        AdapterToSocketUniversal adapterToSocketUniversal2 = AdapterToSocketUniversal.newBuilder().putToEuroSocket().build();
        AdapterToSocketUniversal adapterToSocketUniversal3 = AdapterToSocketUniversal.newBuilder().putToGBSocket().build();

//        int charge1 = phone.charge(adapterToSocketUniversal1);
//        System.out.println(String.valueOf(charge1));
//        int charge2 = phone.charge(adapterToSocketUniversal2);
//        System.out.println(String.valueOf(charge2));
        int charge3 = phone.charge(adapterToSocketUniversal3);
        System.out.println(String.valueOf(charge3));

    }
}
