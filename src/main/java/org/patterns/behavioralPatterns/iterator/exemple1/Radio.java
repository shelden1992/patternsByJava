package main.java.org.patterns.behavioralPatterns.iterator.exemple1;

public class Radio {
    public static void main(String[] args) {

        ChannelCollection channelCollection = listOfChannels();
        ChannelIterator channelIterator = channelCollection.iterator(LanguageTypeEnum.ALL);
        while (channelIterator.hasNext()) {
            System.out.println(channelIterator.next());
        }
    }

    private static ChannelCollection listOfChannels() {
        ChannelCollection channelCollection = new ChannelCollectionImpl();
        channelCollection.addChannel(new Channel(101.1, LanguageTypeEnum.ENGLISH));
        channelCollection.addChannel(new Channel(102.1, LanguageTypeEnum.GERMAN));
        channelCollection.addChannel(new Channel(103.1, LanguageTypeEnum.UKRANIAN));
        channelCollection.addChannel(new Channel(104.1, LanguageTypeEnum.UKRANIAN));
        channelCollection.addChannel(new Channel(105.1, LanguageTypeEnum.UKRANIAN));
        channelCollection.addChannel(new Channel(106.1, LanguageTypeEnum.ENGLISH));
        channelCollection.addChannel(new Channel(107.1, LanguageTypeEnum.GERMAN));
        channelCollection.addChannel(new Channel(107.7, LanguageTypeEnum.POLISH));
        return channelCollection;
    }
}
