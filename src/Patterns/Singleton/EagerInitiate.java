package Patterns.Singleton;

import Interfaces.PatternImplementation;

/**
 * Instance of this class will be created at time of loading wheter we use
 * it or not. so we can move onto lazy initialization if we dont want this.
 * @author Amin Motiwala
 */

public class EagerInitiate implements PatternImplementation {

    private EagerInitiate(){}

    private static final EagerInitiate instance = new EagerInitiate();


    public static EagerInitiate getInstance(){
        return instance;
    }

    public void printMe(){
        System.out.println("Patterns.Singleton Eager Initialization");
    }

}

