package Day_33;

public class Main {
    public static void main(String[] args) {
        Torun torun = new Torun();

        System.out.println(torun.birikmisPara);

        System.out.println(torun.mulk);


        Dede dede = new Dede();

        System.out.println(dede.birikmisPara);

        System.out.println(dede.mulk);

        School school = new School();

        System.out.println(school.schollName);
        school.schoolMotto();

        torun.sacRengi();

        double toplamMiras=torun.birikmisPara+torun.bankadakiPara;

        System.out.println("toplamMiras:"+toplamMiras);

        System.out.println(torun.name);
        System.out.println(torun.id);
        System.out.println(torun.statu);

        torun.ogrenciBilgisi();

        torun.haberlesme();
    }
}
