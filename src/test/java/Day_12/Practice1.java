package Day_12;

public class Practice1 {
    public static void main(String[] args) {
        int x=60;
        int y=70;
        int sum=calculateSum(x,y);
        System.out.println("sum:"+sum);

         String message= getExamResult(sum);
        System.out.println("message:"+ message);


    }
public static int calculateSum(int x,int y){
        return (x+y)/2;
}
public static String getExamResult(int sum){
        String message="";
        if (sum<60){
            message="D";
        } else if (sum >=60 && sum <=70) {
            message="C";
        } else if (sum>=70 && sum <=89) {
            message="B";
        } else if (sum>=90 && sum <=100) {
            message="A";
        }
        return message;

}
}
