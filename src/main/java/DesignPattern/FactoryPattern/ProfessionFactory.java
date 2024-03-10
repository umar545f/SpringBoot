package DesignPattern.FactoryPattern;

public class ProfessionFactory {
    public Profession getProfession(String profession)
    {
        if(profession.equalsIgnoreCase("Doctor"))
        {return  new Doctor();}
        else{
            return new Teacher();
        }
    }
}
