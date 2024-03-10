package DesignPattern.AbstractFactoryPatttern;

public class AbstractFactoryProducer {
    public static AbstractFactory professionalOrNot(boolean isProfessional)
    {
        if(isProfessional)
        {
            return new ProfessionFactory();
        }
        return new TraineeFactory();
    }
}
