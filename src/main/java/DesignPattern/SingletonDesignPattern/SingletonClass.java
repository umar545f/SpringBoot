package DesignPattern.SingletonDesignPattern;

import java.io.Serializable;

public class SingletonClass implements Serializable,Cloneable {
    private static SingletonClass singletonClass = null;

    private SingletonClass()
    {

    }

    public static synchronized SingletonClass getInstance(){
        if(singletonClass==null)
        {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
