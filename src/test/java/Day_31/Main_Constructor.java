package Day_31;

public class Main_Constructor {
    public static void main(String[] args) {
        //  Student student=new Student();

        //  Student student1=new Student("Smith");

        //   Student student2=new  Student(43,"Sengul");

        //   this_Keyword thisKeyword=new this_Keyword("2528","JHON",true);

        //   this_Keyword thisKeyword1=new this_Keyword("4528","Marry",true);

        //   this_Keyword thisKeyword2=new this_Keyword("9532","Sally",false);

        //  Rectangle rectangle=new Rectangle(7,12);

        //  Car car=new Car("Toyota","Corolla",1999,-12000);

       /* Prodact prodact1=new Prodact("elma",1.5,10);
        Prodact prodact2=new Prodact("muz",-2.0,5);
        Prodact prodact3=new Prodact("portakal",3.0,-3);
*/
        Dikdortgen rect1=new Dikdortgen(5.0,3.0);
        Dikdortgen rect2=new Dikdortgen(0.0,0.0);

        rect2.uzunluk=rect1.uzunluk;
        rect2.genislik= rect1.genislik;

        System.out.println("rect2 uzunuk:"+rect2.uzunluk);
        System.out.println("rect2 genislik:"+rect2.genislik);







    }
}
