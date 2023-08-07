package Day_11;

public class Practice2 {
    public static void main(String[] args) {
        averageTemperatureOfTheMonth();
        nameOfTheMonth();
    }
    public static void averageTemperatureOfTheMonth(){
        int week1=22;
        int week2=28;
        int week3=32;
        int week4=34;

        int averageTemperatureOfTheMonth=(week1+week2+week3+week4)/4;
        System.out.println("averageTemperatureOfTheMonth :"+averageTemperatureOfTheMonth);

    }
    public static void  nameOfTheMonth(){
        String nameOfTheMonth="july";
        System.out.println("nameOfTheMonth : "+ nameOfTheMonth );
    }

}
