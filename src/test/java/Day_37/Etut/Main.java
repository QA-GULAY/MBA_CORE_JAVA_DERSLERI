package Day_37.Etut;

public class Main {
    public static void main(String[] args) {
        BaklagilBolgesi baklagilBolgesi=new BaklagilBolgesi();
        baklagilBolgesi.urunListele();
        baklagilBolgesi.stokKontrol();

        SutUrunleriBolgesi sutUrunleriBolgesi=new SutUrunleriBolgesi();
        sutUrunleriBolgesi.stokKontrol();
        sutUrunleriBolgesi.urunListele();
    }
}
