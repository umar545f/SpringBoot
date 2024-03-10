package DesignPattern.FlyweightDesignPattern;

import java.util.Hashtable;

public class AnimalFactory {
    private static Hashtable<String , Animal> hashtable = new Hashtable<>();

    public static Animal getCat(String name)
    {
        Animal animal = hashtable.get(name);
        if(animal!=null)
        {
            return animal;
        }
        animal = new Cat();
        animal.setName(name);
        return animal;
    }
    public static Animal getDog(String name)
    {
        Animal animal = hashtable.get(name);
        if(animal!=null)
        {
            return animal;
        }
        animal = new Dog();
        animal.setName(name);
        return animal;
    }
}
