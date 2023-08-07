package Day_31;

public class Student {
    int x;
    String name;

    boolean statu;

    public Student() {
        System.out.println("Merhaba ben parametre olmayan constructor");
        name = "Oz";
        System.out.println("name:" + name);
    }

    public Student(String soyIsim) {
        System.out.println("Merhaba ben parametre alan constructor");
        name = "Oz";
        System.out.println("name:" + name + " " + soyIsim);
    }

   public Student(int yas,String isim){
       System.out.println("yas ve isim:"+yas+", "+isim);

   }



    }
