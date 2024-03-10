package DesignPattern.ObserverDesignPattern;

public interface StockObservable {
    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifyUsers();

    public void setStockCount(int stockCount);

    public int getCount();

}
