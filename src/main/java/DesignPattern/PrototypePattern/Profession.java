package DesignPattern.PrototypePattern;

public abstract class Profession implements Cloneable {
    public int id;
    public String name;

    public abstract void print();

    public Object cloningMethod() throws CloneNotSupportedException
    {
            return super.clone();
    }

}
