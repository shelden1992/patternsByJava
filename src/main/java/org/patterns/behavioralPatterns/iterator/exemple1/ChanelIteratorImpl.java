package main.java.org.patterns.behavioralPatterns.iterator.exemple1;

import java.util.List;

public class ChanelIteratorImpl implements ChannelIterator {
    private LanguageTypeEnum languageTypeEnum;
    private List<Channel> channelsList;
    private int position;


    public ChanelIteratorImpl(LanguageTypeEnum languageTypeEnum, List<Channel> list) {
        this.languageTypeEnum = languageTypeEnum;
        this.channelsList = list;

    }

    @Override
    public Channel next() {
        Channel с = channelsList.get(position);
        position++;
        return с ;
    }

    @Override
    public boolean hasNext() {
        while (position < channelsList.size()) {
            Channel c = channelsList.get(position);
            if (c.getLanguageTypeEnum().equals(languageTypeEnum) || languageTypeEnum.equals(LanguageTypeEnum.ALL)) {
                return true;
            } else position++;


        }
        return false;
    }
}
