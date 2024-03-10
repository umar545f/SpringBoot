package DesignPattern.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        EarthQuakeResistanceBuilder earthQuakeResistanceBuilder = new EarthQuakeResistanceBuilder();

        Director director = new Director(earthQuakeResistanceBuilder);

        director.manageRequiredHomeConstruction();

        Home home = director.getComplexityObjectOfHome();

        System.out.println(home.floor);
    }
}
