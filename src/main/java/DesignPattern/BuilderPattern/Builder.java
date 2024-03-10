package DesignPattern.BuilderPattern;

public abstract class Builder {
    public abstract void buildFloor();
    public abstract void buildWalls();
    public abstract Home getComplexityObjectOfHome();

}
