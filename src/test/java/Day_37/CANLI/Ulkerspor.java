package Day_37.CANLI;

public class Ulkerspor extends Ulker {

    public String sirketGezisi() {
        return " ulkerSpor ile mutlu bir kamp gezisi";
    }

    @Override
    public void calismaSaatleri() {
        System.out.println("UlkerSpor calisanlari 10 saat mesai yapmak zorunda");
    }
}