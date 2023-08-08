package Day_37.CANLI;

public class Main {
    public static void main(String[] args) {

        Godiva godiva=new Godiva();
        System.out.println(godiva.sirketGezisi());

        Ulkerspor ulkerspor=new Ulkerspor();
        System.out.println(ulkerspor.sirketGezisi());

        godiva.calismaSaatleri();
        ulkerspor.calismaSaatleri();
    }
}