package Day_37;

public interface Goverment {
    //burdaki metodlarda public yada abstrac yazmamiza gerek yok otomatik oyle zaten
    //bodysi olmaz yani suslu parantez kullanilmaz
    //impliment eden alt classlar bundaki tum metodlari kullanmak zorinda
    //inheritance dan farki birden fazla classi impliment edebiliriz ama iki classi ayni anda extends edemiyorduk
    //new--> java class -->interface
    void lesson();
     void eat();
     void sleep();
}
