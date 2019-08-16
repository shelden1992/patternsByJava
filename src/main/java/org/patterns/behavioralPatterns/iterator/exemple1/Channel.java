package main.java.org.patterns.behavioralPatterns.iterator.exemple1;

public class Channel {
    private double frequency;
    private LanguageTypeEnum languageTypeEnum;

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public LanguageTypeEnum getLanguageTypeEnum() {
        return languageTypeEnum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Channel{");
        sb.append("frequency=").append(frequency);
        sb.append(", languageTypeEnum=").append(languageTypeEnum);
        sb.append('}');
        return sb.toString();
    }

    public void setLanguageTypeEnum(LanguageTypeEnum languageTypeEnum) {
        this.languageTypeEnum = languageTypeEnum;
    }

    public Channel(double frequency, LanguageTypeEnum languageTypeEnum) {
        this.frequency = frequency;
        this.languageTypeEnum = languageTypeEnum;
    }
}
