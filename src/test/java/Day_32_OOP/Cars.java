package Day_32_OOP;

public class Cars {
     //privete keywordu yanlizca class icinde kullaniliyor
     //protected keywordu ayni package icinde destekleniyor

    private int id;

    public Cars(int id) {
        this.id = id;

    }
    public void test(){
        System.out.println("id:"+id);
    }
}
