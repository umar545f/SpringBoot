package DesignPattern.ObserverDesignPattern;

public class EmailObserver implements Observer{
    String emailId ;
    public EmailObserver(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void update() {
        System.out.println(emailId + "Stock are available now for Iphone");
    }
}
