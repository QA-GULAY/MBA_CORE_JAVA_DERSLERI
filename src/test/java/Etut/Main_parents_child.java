package Etut;

public class Main_parents_child {
    public static void main(String[] args) {
        Parent parent=new Parent();
        System.out.println(parent.antika);
        parent.antika="tablo";
        System.out.println(parent.antika);
        parent.tamir();

        Child child=new Child();
        System.out.println(child.antika);
        child.tamir();

        double banaKalan= child.birikmisPara-child.birikmisBorc;
        System.out.println("banaKalan:"+banaKalan);
    }
}
