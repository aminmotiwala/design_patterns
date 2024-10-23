import Patterns.Builder.Student;
import Patterns.Factory.AnimalFactory;
import Patterns.Factory.Cat;
import Patterns.Factory.Cow;
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

    }
}