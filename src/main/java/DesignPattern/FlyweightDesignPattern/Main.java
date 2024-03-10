package DesignPattern.FlyweightDesignPattern;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = AnimalFactory.getCat("cat");
        Animal cat2 = AnimalFactory.getCat("cat");

        cat1.printAnimal();
        cat2.printAnimal();

        Animal dog = AnimalFactory.getDog("dog");
        dog.printAnimal();
    }
}
