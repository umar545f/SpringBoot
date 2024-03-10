package DesignPattern.SingletonDesignPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, CloneNotSupportedException {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass duplicateSingleton = SingletonClass.getInstance();

        System.out.println("Hashcode of original : "+ singletonClass.hashCode());
        System.out.println("Hashcode of duplicate : "+duplicateSingleton.hashCode());

        //Break singleton using relections
        Class<?> singletonClassRef = Class.forName
                ("DesignPattern.SingletonDesignPattern.SingletonClass");

        Constructor<SingletonClass> classConstructor=
                (Constructor<SingletonClass>)singletonClassRef
                        .getDeclaredConstructor();
        classConstructor.setAccessible(true);

        SingletonClass singletonClassReflection = classConstructor.newInstance();

        System.out.println("Hashcode of relection : "+singletonClassReflection.hashCode());

        //Break using Serialization

        // Serialize the singleton object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(singletonClass);
        out.close();

        // Deserialize the object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonClass singletonClassDeserialized = (SingletonClass) in.readObject();
        in.close();

        // Check hashcodes
        System.out.println("Hashcode of deserialized: " + singletonClassDeserialized.hashCode());

        //Break using cloning

        SingletonClass clonedObject = (SingletonClass)singletonClass.clone();

        System.out.println("Hashcode of cloned object : "+ clonedObject.hashCode());

    }

}
