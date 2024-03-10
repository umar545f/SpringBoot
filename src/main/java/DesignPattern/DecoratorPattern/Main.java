package DesignPattern.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheese(new MargharitaPizza());
        System.out.println(basePizza.cost());
    }
}
