package Patterns.Singleton;

import Interfaces.PatternImplementation;

/**
 * this is like eager but since object is initiated in a subclass it does not spins up at start.
 * when someone calls the getInstance() method,
 * this class gets loaded and creates the singleton class instance.
 * This is the most widely used approach for the singleton class as it doesn’t require synchronization.
 * @author Amin Motiwala
 */

public class HelperClassEagerInitiate implements PatternImplementation {

    private HelperClassEagerInitiate(){}

    public static HelperClassEagerInitiate getInstance(){
        return Initiater.instance;
    }

    public void printMe(){
        System.out.println("Patterns.Singleton Eager Helper Initialization");
    }

    private static class Initiater {
        private static final HelperClassEagerInitiate instance = new HelperClassEagerInitiate();
    }

}

