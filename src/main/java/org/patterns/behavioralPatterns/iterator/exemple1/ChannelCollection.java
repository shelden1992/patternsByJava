package main.java.org.patterns.behavioralPatterns.iterator.exemple1;

public interface ChannelCollection {
    void addChannel(Channel channel);

    void removeChannel(Channel channel);

    ChannelIterator iterator(LanguageTypeEnum languageTypeEnum);
}
