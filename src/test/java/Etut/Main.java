package Etut;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Alice Smith", 40,20);
        System.out.println("ad soyad:"+employee.adSoyad);
        System.out.println("calisilan saat:"+employee.calisilanSaat);
        System.out.println("calisilan ucret:"+employee.calisilanUcret);

        employee.maasHesapla();
    }
}
