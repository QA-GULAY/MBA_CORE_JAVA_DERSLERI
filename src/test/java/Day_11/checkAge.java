package Day_11;

public class checkAge {
    public static void main(String[] args) {
        int age=13;
        checkAge(age);

    }
    public static void checkAge(int age){
     //   String durum= (age >=16)?"erisim izni verildi":"erisim reddedildi";
    //    System.out.println(durum);

        if (age>16){
            System.out.println("erisim izni verildi");

        }else {
            System.out.println("erisim reddedildi");
        }

        }

    }

