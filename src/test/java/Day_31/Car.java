package Day_31;

public class Car {
    String marka;
    String model;

    int yil;
    double fiyat;

    public Car(String marka, String model, int yil, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

        if (fiyat < 0) {
            System.out.println("Gecersiz fiyat");
        }else {
            System.out.println("marka:"+marka);
            System.out.println("model:"+model);
            System.out.println("yil:"+yil);
            System.out.println("fiyat:"+fiyat);
        }
    }
}