package DesignPattern.StrategyDesignPattern;

public class Main {

    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = PaymentStrategyFactory.
                findPaymentMethod("paypal");
        Shopping shopping = new Shopping(paymentStrategy);
        shopping.pay();
    }
}
