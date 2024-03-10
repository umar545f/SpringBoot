package DesignPattern.BuilderPattern;

public class FloodResistanceBuilder extends Builder{
    public Home floodResistanceHome = new Home();
    @Override
    public void buildFloor() {
        this.floodResistanceHome.floor = "concrete floors";
    }

    @Override
    public void buildWalls() {
        this.floodResistanceHome.walls = "concrete walls";
    }

    @Override
    public Home getComplexityObjectOfHome() {
        return floodResistanceHome;
    }
}
