package DesignPattern.PrototypePattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ProfessionCache.loadProfessionCache();
        Profession doc = ProfessionCache.getCloneNewProfession(1);
        System.out.println(doc);

        Profession doc1 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(doc1);
    }

}
