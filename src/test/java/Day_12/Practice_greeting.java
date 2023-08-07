package Day_12;

public class Practice_greeting {
    public static void main(String[] args) {

        int hour=27;
        System.out.println(getgreeting(hour));

    }
    public static String getgreeting(int hour){
        String message="";

        if (hour>=6 && hour <=11){
            message="gunaydin!!";
        } else if (hour>=12 && hour <=17) {
            message="tunaydin";
        } else if (hour>=18 && hour<=22) {
            message="iyi aksamlar";
        } else if((hour>=22 && hour <=23)||(hour>=0 && hour<=5 )){
            message="iyi geceler!!!";
        }else {
            message="gecersiz saat";

        }
        return message;


    }
}
