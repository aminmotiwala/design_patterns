package Patterns.Observer;

public class Subscriber {
    String name;
    public void getNotification(String message){
        System.out.println(name + " is notified of message: "+ message);
    }

    public Subscriber(String name){
        this.name = name;
    }
}
