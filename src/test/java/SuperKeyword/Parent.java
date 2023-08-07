package SuperKeyword;

public class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
        System.out.println("Burasi parent class");
        System.out.println("name:"+name);
    }
    public  void bahceIsleri(){
        System.out.println("bahce temizlenmeli");
    }
    public  void mutfakIsleri(){
        System.out.println("mutfak temizlenmeli");
    }
    public  void kilerIsleri(){
        System.out.println("kiler temizlenmeli");
    }
    public  void selamlama(){
        System.out.println("Parent :selamlama");
    }
}
