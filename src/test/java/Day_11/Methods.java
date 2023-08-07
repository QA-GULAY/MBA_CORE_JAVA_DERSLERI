package Day_11;

public class Methods {
    public static void main(String[] args) {
      PrintHello();
      printWorld();
      sum();
      product();
    }
    public static void PrintHello(){
        System.out.print("Hello  ");
    }

    public static void printWorld(){
        System.out.println("World!!!");
    }

    public static void sum(){
        int x = 2;
        int y = 4;

        int sum = x + y;
        System.out.println("sum :"+sum);
    }
    public static void product(){
        int x = 2;
        int y = 4;

        int product = x * y;
        System.out.println("product :"+product);
    }



}
