import Patterns.Builder.Student;
import Patterns.Factory.AnimalFactory;
import Patterns.Factory.Cat;
import Patterns.Factory.Cow;
import Patterns.Observer.Subscriber;
import Patterns.Observer.YoutubeChannel;
import Patterns.Singleton.*;

public class Main {
    public static void main(String[] args) {

        //Patterns.Singleton Eager Initialization
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

        //Calling builder pattern
        System.out.println("********* Patterns.Builder Pattern *********");
        Student aminStudent = new Student.StudentBuilder(123).setFirstName("Amin").setLastName("Motiwala")
                .setGrade("A").build();
        System.out.println(aminStudent.toString());

        //Calling factory pattern
        System.out.println("********* Factory Pattern *********");
        Cat cat = new Cat();
        Cow cow = new Cow();
        AnimalFactory.registerAnimal("cat", cat);
        AnimalFactory.registerAnimal("cow", cow);
        System.out.println(AnimalFactory.getAnimal("cow").speak());

        //Calling factory pattern
        System.out.println("********* Observer Pattern *********");
        YoutubeChannel disney = new YoutubeChannel("Disney");
        Subscriber amin = new Subscriber("Amin");
        disney.subscribe(amin);

        Subscriber ali =  new Subscriber("Ali");
        disney.subscribe(ali);
        disney.notifySubscribers("Hi Channel is live");

        disney.unSubscribe(ali);
        disney.notifySubscribers("Hi Channel is offline");


    }
}