package DesignPattern.AbstractFactoryPatttern;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.professionalOrNot(false);
        Profession p = abstractFactory.getProfession("Doctor");
        p.print();
    }

}
