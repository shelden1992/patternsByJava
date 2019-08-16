package main.java.org.patterns.structuralPatterns.adapter.exemple3;

import java.util.Objects;

public class AdapterToSocketUniversal implements EuroSocket {
    private AmericanSocket americanSocket;
    private EuroSocket euroSocket;
    private GBSocket gbSocket;

    private AdapterToSocketUniversal() {

    }

    public static Builder newBuilder() {
        return new AdapterToSocketUniversal().new Builder();

    }

    @Override
    public int getVolt() {
        if (Objects.nonNull(americanSocket)) {
            return americanSocket.getVolt();
        } else if (Objects.nonNull(euroSocket)) {
            return euroSocket.getVolt();
        } else return gbSocket.getVolt();

    }

    public class Builder {
        public AdapterToSocketUniversal build() {
            return AdapterToSocketUniversal.this;
        }

        public Builder putToAmericanSocket() {
            AdapterToSocketUniversal.this.americanSocket = new SimpleAmericanSocket();
            return this;

        }

        public Builder putToEuroSocket() {
            AdapterToSocketUniversal.this.euroSocket = new SimpleEuroSocket();
            return this;
        }

        public Builder putToGBSocket() {
            AdapterToSocketUniversal.this.gbSocket = () -> 180;
            return this;
        }

    }
}
