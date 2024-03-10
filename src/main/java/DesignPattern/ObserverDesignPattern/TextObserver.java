package DesignPattern.ObserverDesignPattern;

public class TextObserver implements Observer{
    String phoneNo;

    public TextObserver(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public void update() {
        System.out.println
                (phoneNo+"!! Hello stocks for iphone are available now");
    }
}
