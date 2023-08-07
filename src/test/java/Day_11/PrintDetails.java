package Day_11;

public class PrintDetails {
    public static void main(String[] args) {
        String ad="John Doe";
        int yas= 80;
        double boy=1.75;

        printDetails(ad,yas, boy);

    }
    public static void printDetails(String ad,int yas,double boy ){
        if (yas < 18){
            System.out.println("resit degilsiniz");
        } else if (yas>18 && yas<65) {
            System.out.println("siz bir yetiskinsiniz");

        }else {
            System.out.println("yasli bir vatandassiniz");
        }


    }
}
