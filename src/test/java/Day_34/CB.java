package Day_34;

public class CB {
    String cbName;
    int cbYas;
     public CB(){
         System.out.println("Parent:parametresi olmayan constracter");
     }

    public CB(String cbName, int cbYas) {
        this.cbName = cbName;
        this.cbYas = cbYas;
        System.out.println("burasi CB class");
    }
}
