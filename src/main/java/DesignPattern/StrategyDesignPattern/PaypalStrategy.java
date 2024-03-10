package DesignPattern.StrategyDesignPattern;

public class PaypalStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payed using UPI");
    }
}
