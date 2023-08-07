public class Trim_practice {
    public static void main(String[] args) {
        String name = "     Ahmet    ";

        String trimmedString = name.trim();
/*

        System.out.println("name :"+ name);

        System.out.println("trimmedString: "+ trimmedString);
*/

       /* if (name.equals(trimmedString)){
            System.out.println("stringler ayni");
        }else {
            System.out.println("stringler farkli");
        }
*/
        //TASK

        String text_1="text_1   ";
        String text_2="text_2";

        System.out.println("without trim:" + text_1+text_2);

        String text_3=text_1.trim();
        System.out.println("with trim:"+text_3+text_2);




    }


}
