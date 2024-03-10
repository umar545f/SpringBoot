package DesignPattern.BuilderPattern;

public class Director {
    private Builder builder;
    public Director(Builder builderType ) {
        this.builder = builderType;
    }

    public Home getComplexityObjectOfHome()
    {
        return this.builder.getComplexityObjectOfHome();
    }

    public void manageRequiredHomeConstruction() {
        this.builder.buildFloor();
        this.builder.buildWalls();
    }
}
