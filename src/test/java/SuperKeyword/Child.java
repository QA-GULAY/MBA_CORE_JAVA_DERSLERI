package SuperKeyword;

public class Child extends Parent{
    int id;
    public Child(int id){
        super("MBA");
        this.id=id;
        System.out.println("Burasi child class");
        System.out.println("id:"+id);

    }
    public void evIsleri(){
        System.out.println("Ev isleri :");
        super.bahceIsleri();
        super.kilerIsleri();
        super.mutfakIsleri();
    }
    public  void selamlama(){
        System.out.println("Child :selamlama");
        super.selamlama();
}
    }