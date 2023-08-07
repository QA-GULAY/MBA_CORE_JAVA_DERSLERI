package Day_11;

public class practice_valume {
    public static void main(String[] args) {
        double uzunluk=12.5;
        double yukseklik=10;
        double genislik=5;
        calculateVolume( uzunluk,yukseklik,genislik);
    }
    public static void calculateVolume(double uzunluk,double yukseklik,double genislik){
        double hacim=(uzunluk*yukseklik*genislik);
        System.out.println( "volume : "+ hacim);

    }
}

