package Day_32_OOP;

public class Person {
    String name;
    int age;
    String address;
    public Person(String name, int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void printInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
    }

}
