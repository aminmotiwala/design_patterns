package Patterns.Factory;

import java.util.HashMap;

public class AnimalFactory {
    public static HashMap<String,Animal> animals = new HashMap<>();

    public static void registerAnimal(String animalName, Animal a){
        animals.put(animalName, a);
    }

    public static Animal getAnimal(String animalName){
        return animals.get(animalName);
    }
}
