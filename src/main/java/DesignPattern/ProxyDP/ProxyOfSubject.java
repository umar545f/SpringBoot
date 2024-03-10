package DesignPattern.ProxyDP;

public class ProxyOfSubject extends RealSubjectClass{
    @Override
    public void method()
    {
        System.out.println("I am proxy , i will perform authentications");
        //Check if client call is legit ; if yes then call the real object

        super.method();

    }
}
