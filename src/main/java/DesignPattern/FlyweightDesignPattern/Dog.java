package DesignPattern.FlyweightDesignPattern;

public class Dog implements Animal {
    private static String name = null;

    @Override
    public void setName(String name) {
        Dog.name = name;
    }

    @Override
    public void printAnimal() {
        System.out.println("Name is : "+name);
        System.out.println("Eyes are : "+CommonSharealeClass.eyes);
        System.out.println("Nose is : "+CommonSharealeClass.nose);
        System.out.println("Legs are : "+CommonSharealeClass.legs);
    }
}
