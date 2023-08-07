package Day_31;

public class this_Keyword {
    private String id;

    private String name;

    private  boolean statu;

    public this_Keyword(String id,String name,boolean statu){
        this.id=id;
        this.name=name;
        this.statu=statu;

        System.out.println("*******************");
        System.out.println("*id:"+id+"*");
        System.out.println("*Name:"+name+"*");
        System.out.println("*statu:"+statu+"*");
        System.out.println("*******************");
    }
}
