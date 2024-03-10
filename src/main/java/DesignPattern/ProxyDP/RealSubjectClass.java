package DesignPattern.ProxyDP;

public class RealSubjectClass implements Subject{
    @Override
    public void method() {
        System.out.println("This is real subject implementaions ; rest are proxies");
    }
}
