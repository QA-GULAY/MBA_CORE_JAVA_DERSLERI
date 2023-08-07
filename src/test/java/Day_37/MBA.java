package Day_37;

public abstract class MBA {
    public void Toplanti(){}

    public static final void gezi(){}       // bu sekilde parantez (body) ekliyeb  iliyoruz

    public abstract void calisma();  //fakat abstract yaptigimiz zaman body susulu parantez
                                     //ekliyemiyoruz bu su demeek alt classlar kendi uygulamalarini yapabilir sen
                                      //bi direktif burdan yollayamazsin.Metodu bos yollar onlar icini doldurur.
    /*abstract class abstract anahtar kelimesi ile bildirilmeli
    *bir metad abstrac ise muhakkak alt claslarda kullanilmak zorunda yoksa hata verir.
    * abstract class abstract  ve abstract olmayan metodlara sahip olabilir
    * dogrudan baslatilamazlar.(Main de new keyword ile constracter olusurup baslatamayiz)
    * constractor ve statik metodlar olabilir
    * sub classin metod govdesini degistirmemek icin final metodlara sahip olabilir*/
}
