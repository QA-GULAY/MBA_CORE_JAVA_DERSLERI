package Day_35.parctice;

import java.util.Scanner;

  class Password_Id {

      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Lutfen bir isim giriniz");
          String name = scanner.nextLine();

          System.out.println("Lutfen soy isim giriniz");
          String lastName = scanner.nextLine();

          System.out.println("Lutfen ikinci isminizi giriniz");
          String middleName = scanner.nextLine();

          System.out.println("Lutfen yasinizi giriniz");
          int age = scanner.nextInt();

          if (middleName.isEmpty()) {
              System.out.println(pasaportId(age, name, lastName));
          } else {
              System.out.println(pasaportId(age, name, lastName, middleName));
          }


      }

      public static String pasaportId(int age, String name, String lastName) {
          String id = age + name + lastName;

          return id;

      }

      public static String pasaportId(int age, String name, String lastName, String middleName) {
          String id = age + name + lastName + middleName;
          return id;
      }

  }