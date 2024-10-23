package Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {
    List<Subscriber> subscribers = new ArrayList<>();
    String channelName;

    public YoutubeChannel(String channelName){
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String message) {
        for (Subscriber s : subscribers){
            s.getNotification("Channel: "+channelName+" message:" +message);
        }
    }
}
