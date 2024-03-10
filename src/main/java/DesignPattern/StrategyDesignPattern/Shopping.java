package DesignPattern.StrategyDesignPattern;

public class Shopping {
    PaymentStrategy paymentStrategy;

    public Shopping(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay()
    {
      this.paymentStrategy.pay();
    }
}
