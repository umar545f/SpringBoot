package DesignPattern.StrategyDesignPattern;

public class CreditCardStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("payment using credit card");
    }
}
