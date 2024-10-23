package Patterns.Observer;

public interface Channel {
    public void subscribe(Subscriber subscriber);
    public void unSubscribe(Subscriber subscriber);
    public void notifySubscribers(String message);
}
