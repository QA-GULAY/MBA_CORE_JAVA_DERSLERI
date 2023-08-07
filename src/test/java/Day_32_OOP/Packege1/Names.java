package Day_32_OOP.Packege1;

public class Names {

    protected String name; //ptotected keyword oldugunda sorun yok cunki ayni package icinde kullanilabilr
                          // private'a gore daha esnek

    public Names(String name) {
        this.name = name;
    }
    public  void test(){
        System.out.println("name:"+name);
    }
}
