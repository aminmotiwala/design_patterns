package Patterns.Singleton;

import Interfaces.PatternImplementation;
import java.util.Objects;

/**
 * now adding synchronized to getinstance this makes this thread safe, also this makes this thread save
 * what if a lot of threads are calling getinstance at the same time, each thread will have to wait
 * causing latency, we only want a thread to wait if instance is not created, when instance
 * is already initialzed why wait just return for that we will move to fast Threadsafe getinstance
 * @author Amin Motiwala
 */

public class ThreadSafeInitiate implements PatternImplementation {

    private static ThreadSafeInitiate instance;
    private ThreadSafeInitiate (){}

    public static synchronized ThreadSafeInitiate getInstance(){
        if (Objects.isNull(instance)){
            instance = new ThreadSafeInitiate();
        }
        return instance;
    }

    @Override
    public void printMe() {
        System.out.println("Thread Safe Getinstance");
    }
}
