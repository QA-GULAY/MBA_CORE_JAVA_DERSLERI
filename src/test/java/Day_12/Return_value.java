package Day_12;

public class Return_value  {
    public static void main(String[] args) {
        int x=5;
        int y=5;
        int z=6;
        calculateAverage(x,y,z);

        System.out.println(calculateAverage(x,y,z));
    }
    public static double calculateAverage(int x,int y,int z){
        double average=(x+y+z)/3;
        return average;
    }


}
