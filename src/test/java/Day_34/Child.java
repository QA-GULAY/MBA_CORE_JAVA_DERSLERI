package Day_34;

public class Child  {
    private String isim;
    private int yas;
    double maas;
    double vergi;

    public Child(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public Child(double maas, double vergi) {
        this.maas=maas;
        this.vergi=vergi;
    }

    public void nufusBilgileri() {
        System.out.println("isim=" + isim + " , yas =" + yas);

    }

    public double netMaas() {
        double netMaas = maas - vergi;
        return netMaas;

    }



    }

