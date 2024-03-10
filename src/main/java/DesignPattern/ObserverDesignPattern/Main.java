package DesignPattern.ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneStockObservable();
        Observer observer1 = new EmailObserver("abc@gmail.com");
        Observer observer2 = new TextObserver("8171449876");

        stockObservable.add(observer1);
        stockObservable.add(observer2);

        stockObservable.setStockCount(19);
    }


}
