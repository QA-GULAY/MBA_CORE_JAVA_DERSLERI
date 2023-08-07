package Metod_Practice;

public class Main {
    public static void main(String[] args) {

        double firstExam = 70.6;
        double secondExam = 65.0;
        double thirdExam = 80.8;
        Index index = new Index();
        double ortalama=index.calculateAverage(firstExam,secondExam,thirdExam);
        System.out.println("ortalama:"+ortalama);


    }
}
