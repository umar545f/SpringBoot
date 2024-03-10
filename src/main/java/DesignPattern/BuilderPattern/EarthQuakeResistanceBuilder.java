package DesignPattern.BuilderPattern;

public class EarthQuakeResistanceBuilder extends Builder{
    public Home earthQuakeResistanceHome = new Home();
    @Override
    public void buildFloor() {
        this.earthQuakeResistanceHome.floor = "Wooden floor";
    }

    @Override
    public void buildWalls() {
        this.earthQuakeResistanceHome.walls = "Wooden walls";
    }

    @Override
    public Home getComplexityObjectOfHome() {
        return earthQuakeResistanceHome;
    }
}
