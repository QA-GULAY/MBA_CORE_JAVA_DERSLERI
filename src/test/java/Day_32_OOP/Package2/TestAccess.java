package Day_32_OOP.Package2;

public class TestAccess {
    String name;
    int age;
    String address;

    public TestAccess(String name, int age, String address) {  // burdaki poblic keywordunu silersek defoult olur
                                                               // baska packagelerden erisilmez
                                                               //protected olursa diger paketlerden ulasamayiz ama
                                                               //kendi paketinde ulasilabilir.


        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
    }

}
