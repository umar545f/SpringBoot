package DesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{
    public List<Observer> observerList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(Observer observer) {
            observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
            observerList.remove(observer);
    }

    @Override
    public void notifyUsers() {
        for(Observer observer : observerList)
        {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockAdded) {
        if(stockCount == 0)
        {
            notifyUsers();
        }
        stockCount += stockAdded;
    }

    @Override
    public int getCount() {
        return stockCount;
    }
}
