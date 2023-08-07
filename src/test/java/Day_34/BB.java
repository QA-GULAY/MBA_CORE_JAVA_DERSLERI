package Day_34;

public class BB extends CB {
    String cbName;
    int cbYas;
    public BB(){
        super();
    }

    public BB(String cbName, int cbYas) {
        super(cbName,cbYas);    //SUPER KEYWORD ilk satirda olmak zorunda
        this.cbName=cbName;
        this.cbYas=cbYas;
        System.out.println("Hello burasi child class");
    }
}