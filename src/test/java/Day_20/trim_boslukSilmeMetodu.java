package Day_20;

public class trim_boslukSilmeMetodu {
    public static void main(String[] args) {

        //  trim()   String icindeki bastaki ve sondaki bosluklari siliyor

        String text="     Hello world     ";
        System.out.println(">"+text+"<");

        String degistilmisText=text.trim();
        System.out.println(">"+degistilmisText+"<");


        //>     Hello world     <
        //>Hello world<


    }
}
