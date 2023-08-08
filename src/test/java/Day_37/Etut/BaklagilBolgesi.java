package Day_37.Etut;

public class BaklagilBolgesi extends UrunBolgesi{
    @Override
    public void urunListele() {
        System.out.println("Nohut,Kurufasulye");
    }

    @Override
    public void stokKontrol() {
        System.out.println("stoklar yetersiz");
    }
}
