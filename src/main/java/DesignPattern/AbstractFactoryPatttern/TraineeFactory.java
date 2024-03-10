package DesignPattern.AbstractFactoryPatttern;

public class TraineeFactory implements AbstractFactory {

    @Override
    public Profession getProfession(String profession)
    {
        if(profession.equalsIgnoreCase("Doctor"))
        {
            return  new TraineeDoctor();
        }
        else{
            return new TraineeTeacher();
        }
    }
}
