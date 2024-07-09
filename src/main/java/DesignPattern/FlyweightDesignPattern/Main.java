package DesignPattern.FlyweightDesignPattern;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = AnimalFactory.getCat("cat1");
        Animal cat2 = AnimalFactory.getCat("cat2");

        cat1.printAnimal();
        cat2.printAnimal();

        Animal dog = AnimalFactory.getDog("dog");
        dog.printAnimal();
    }
}
