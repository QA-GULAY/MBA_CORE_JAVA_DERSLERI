package Day_37.Etut;

public class SutUrunleriBolgesi extends UrunBolgesi{
    @Override
    public void urunListele() {
        System.out.println("peyni,lor,tereyag");
    }

    @Override
    public void stokKontrol() {
        System.out.println("Stoklar yeterli");
    }
}
