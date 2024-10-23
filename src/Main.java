import Singleton.*;

public class Main {
    public static void main(String[] args) {

        //Singleton Eager Initialization
        EagerInitiate eagerInitiate = EagerInitiate.getInstance();
        eagerInitiate.printMe();

        //Sinleton Lazy Initialization
        LazyInitiate lazyInitiate = LazyInitiate.getInstance();
        lazyInitiate.printMe();

        //Sinleton Thread Safe Initialization
        ThreadSafeInitiate threadSafeInitiate = ThreadSafeInitiate.getInstance();
        threadSafeInitiate.printMe();

        //Sinleton Fast Thread Safe Initialization
        FastThreadSafeInitiate fastThreadSafeInitiate = FastThreadSafeInitiate.getInstance();
        fastThreadSafeInitiate.printMe();

        //Sinleton helper Thread Safe Initialization
        HelperClassEagerInitiate helperClassEagerInitiate = HelperClassEagerInitiate.getInstance();
        helperClassEagerInitiate.printMe();


    }
}