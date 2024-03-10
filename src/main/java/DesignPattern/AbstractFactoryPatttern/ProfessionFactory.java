package DesignPattern.AbstractFactoryPatttern;

public class ProfessionFactory implements AbstractFactory {

    @Override
    public Profession getProfession(String profession)
    {
        if(profession.equalsIgnoreCase("Doctor"))
        {return  new Doctor();}
        else{
            return new Teacher();
        }
    }
}
