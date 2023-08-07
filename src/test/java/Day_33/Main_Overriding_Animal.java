package Day_33;

public class Main_Overriding_Animal {
    public static void main(String[] args) {

        //OVERRIDING METHOD AYNI METODA YAZILABILIR,DEGISTIRILEBILIR.YANI METHOD BIR CIKTI FARKLI OLABILIR

        Animal animal=new Animal();
        Cat cat=new Cat();

        animal.animalSound();  //The animal makes a sound.
        cat.animalSound();     //The cat meows.
    }
}
