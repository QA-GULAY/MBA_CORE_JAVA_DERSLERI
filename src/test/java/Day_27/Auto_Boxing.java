package Day_27;

public class Auto_Boxing {
    public static void main(String[] args) {
        //Auto Boxing
        int y = 10;
        Integer z = y;
        System.out.println("z:" + z);

        double doublePrimitive=12.8;
        Double doubleObject=doublePrimitive;
        System.out.println("doubleObject:"+doubleObject);

        boolean statuPrimitive=true;
        Boolean statuObject=statuPrimitive;
        System.out.println("statuObject:"+statuObject);

        char e='e';
        Character eObject=e;
        System.out.println("eObject:"+eObject);


    }
}
