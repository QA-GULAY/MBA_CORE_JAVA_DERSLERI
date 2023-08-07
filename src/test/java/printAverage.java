public class printAverage {
    public static void main(String[] args) {
        double x=12;
        double y=12;
        printAverage(x,y);


    }
    public static void printAverage(double x,double y){
        double myDouble =x+y;
        int myInt=(int) myDouble;

        if (myDouble %2==0 ){
            System.out.println(myDouble);

        } else  {
            System.out.println(myInt);

        }
    }
}
