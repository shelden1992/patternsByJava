package main.java.org.patterns.behavioralPatterns.iterator.exemple1;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channelList;

    public ChannelCollectionImpl(List<Channel> channelList) {
        this.channelList = channelList;
    }

    public ChannelCollectionImpl() {
        this.channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        channelList.add(channel);

    }

    @Override
    public void removeChannel(Channel channel) {
        channelList.remove(channel);

    }

    @Override
    public ChannelIterator iterator(LanguageTypeEnum languageTypeEnum) {

        return new ChanelIteratorImpl(languageTypeEnum, this.channelList);
    }
}
