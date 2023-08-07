package Day_12;

public class Return_data {
    public static void main(String[] args) {
        int x=19;
        int y=12;
        int max= findMax(x,y);
        System.out.println("max ="+max);
    }
    public static int findMax(int x,int y){
        int max=0;
        if (x>y){
            max=x;
        }else {
            max=y;
        }
       return max;
    }
}
