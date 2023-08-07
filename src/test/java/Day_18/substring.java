package Day_18;

public class substring {
    public static void main(String[] args) {

        //index 0·dan  substring verdigimiz numaradan baslar

       /* String text="This is a text ";

        System.out.println(text.substring(5));
        */

        //TASK
        String test="MASTER";                // M A S T E R
        int n=2;                             // 0 1 2 3 4 5  (INDEX)
        String sonuc=getSubstring(test,n);   //     S T E R   (SUBSTRINGi 2den baslattik)
        System.out.println("sonuc:"+sonuc);
    }
    public static String getSubstring(String str,int n){

        if (n>=str.length()){
            return str;
        }else {
            return str.substring(n);

        }


        // TASK       SUBSTRINGIN 2.TURU BI BASLANGIC NUMARASI BIDE BTIS NUMARASI VERDIGIMIZ,
        //              AMA BITIS NUMARASINDAKI KARAKTERDE DURUR ONU YAZDIRMAZ

       /* String text="Hello";
        System.out.println(text.substring(1,3));   // el
        */
    }
}
