package Day_11;

public class PrintOddNumbers {
    public static void main(String[] args) {

        int sayi=12;
        printOddNumbers(sayi);
    }
    public static void printOddNumbers(int sayi){

        for (int i = 1; i <=sayi; i+=2) {
            if (i>=12){
                break;
            }
            if (i%3==0){
                continue;
            }
            System.out.println(i);
            }

        }

    }

