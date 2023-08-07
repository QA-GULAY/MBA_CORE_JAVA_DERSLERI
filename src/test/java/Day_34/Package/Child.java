package Day_34.Package;

public class Child extends Parent {

    public void kisiBilgileri() {
        System.out.println("Kisi Bilgileri:");
        System.out.println("Anne adi:"+super.motherName);
        System.out.println("Baba adi:"+super.fatherName);



    }
}
