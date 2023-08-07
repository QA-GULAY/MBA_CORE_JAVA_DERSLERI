package Day_20;

public class practice {
    public static void main(String[] args) {
       //  replace()
        /*String text="Hello world";
        String degistirilmisText= text.replace("Hello", "merhaba");
        System.out.println("degistirilmisText:"+degistirilmisText);*/

        // trim()
        /*String text="   Hello world"  ;
        System.out.println("<"+text+"<");

        String degistirilmisText=text.trim();
        System.out.println("<"+degistirilmisText+"<");*/

        //startsWith()  boolean donduruyor
       /* String text="hello world!";
        boolean statu=text.startsWith("H");
        System.out.println("statu:"+statu);
        */
        //endsWith()  boolean donduruyor
        /*String text="hello world!";
        boolean statu=text.endsWith("H");
        System.out.println("statu:"+statu);
*/


        //CHARACTER  BIR JAVA KUTUPHANESINDEN GELEN BI CLASS ICINDE METODLAR BARINDIRIR

        String text="Hello world";
        boolean statu=Character.isLetter(text.charAt(0));
        System.out.println("statu:"+statu);

        String sayi="5a";
        boolean statu1=Character.isDigit(sayi.charAt(0));  //5i true,,a'yi false veriyor
        System.out.println("statu1:"+statu1);






    }
}
