package Singleton;

import Interfaces.PatternImplementation;
import java.util.Objects;

/**
 * Okay this is an improvment from Eager Initialization so instance is only created
 * when some class calls getInstance
 * but this raises an issue what if multiple threads call getInstance at the same time
 * it will create two instances and defeat its purpose as a singleton
 * to improve this we use syncronized
 * @author Amin Motiwala
 */

public class LazyInitiate implements PatternImplementation {

    private LazyInitiate(){}

    private static LazyInitiate instance;

    public static LazyInitiate getInstance(){
        if (Objects.isNull(instance)) {
            instance = new LazyInitiate();
        }
        return instance;
    }

    @Override
    public void printMe() {
        System.out.println("Singleton Lazy Initialize");
    }
}
