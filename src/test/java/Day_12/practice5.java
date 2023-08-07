package Day_12;

public class practice5 {
    public static void main(String[] args) {
        String name="Jane";
        String nickName=nickNameGenerator(name);
        System.out.println("nickName="+nickName);



    }
    public static String nickNameGenerator(String name) {
        String nickName=name+"nny";
        return nickName ;
    }


    }
