package Day_34;

public class Student {
    private String isim;
    private int yas;

    public Student() {
        this("Selda",37);
    }

    public Student(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
        System.out.println(isim + "," + yas);

    }

}