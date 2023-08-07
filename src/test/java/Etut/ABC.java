package Etut;

public class ABC {
    String sirketIsmi;
    int yillikCiro;

    public  ABC(String sirketIsmi, int yillikCiro) {
        this.sirketIsmi = sirketIsmi;
        this.yillikCiro = yillikCiro;
    }
    public  void sirketBilgileri(){
        System.out.println("sirketIsmi:"+sirketIsmi);
        System.out.println("yillikCiro:"+yillikCiro);
    }
}
