package DesignPattern.StrategyDesignPattern;

public class PaymentStrategyFactory {
    public static PaymentStrategy findPaymentMethod(String input)
    {
        if(input.equalsIgnoreCase("paypal"))return new PaypalStrategy();
        else if(input.equalsIgnoreCase("credit card"))return new CreditCardStrategy();
        return null;
    }
}
