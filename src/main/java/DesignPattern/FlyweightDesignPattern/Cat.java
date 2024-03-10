package DesignPattern.FlyweightDesignPattern;

public class Cat implements Animal {
    private static String name = null;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printAnimal() {
        System.out.println("Name is : "+name);
        System.out.println("Eyes are : "+CommonSharealeClass.eyes);
        System.out.println("Nose is : "+CommonSharealeClass.nose);
        System.out.println("Legs are : "+CommonSharealeClass.legs);
    }
}