package Singleton;

import Interfaces.PatternImplementation;

import java.util.Objects;

/**
 * we write a separate synchronize block which will run if only instance is not empty
 * @author Amin Motiwala
 */

public class FastThreadSafeInitiate implements PatternImplementation {

    private static FastThreadSafeInitiate instance;
    private FastThreadSafeInitiate(){}

    public static FastThreadSafeInitiate getInstance(){

        if (Objects.isNull(instance)){
            synchronized (FastThreadSafeInitiate.class) {
                if (Objects.isNull(instance)){
                    instance = new FastThreadSafeInitiate();
                }
            }
        }
        return instance;
    }

    @Override
    public void printMe() {
        System.out.println("Fast Thread Safe Getinstance");
    }
}
