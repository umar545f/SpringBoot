package DesignPattern.PrototypePattern;

import java.util.Hashtable;

public class ProfessionCache {

    private static Hashtable<Integer , Profession> hashtable = new Hashtable<>();
    public static Profession getCloneNewProfession(int i) throws CloneNotSupportedException {
        Profession professionInstance = hashtable.get(i);
        return (Profession)professionInstance.cloningMethod();
    }
    public static void loadProfessionCache()
    {
        Doctor doctor = new Doctor();
        doctor.id = 1;
        hashtable.put(doctor.id,doctor);

        Teacher teacher = new Teacher();
        teacher.id = 2;
        hashtable.put(teacher.id,teacher);
    }
}
