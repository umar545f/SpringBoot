package DesignPattern.ProxyDP;

public class Main {
    public static void main(String[] args) {
        Subject proxyOfSubject = new ProxyOfSubject();
        proxyOfSubject.method();
    }
}
