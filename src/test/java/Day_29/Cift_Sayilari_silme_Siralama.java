package Day_29;

import java.util.ArrayList;
import java.util.Collections;

public class Cift_Sayilari_silme_Siralama {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(93);
        list.add(32);
        list.add(22);
        list.add(51);
        System.out.println("orjinal liste:"+list);

        for (int i = list.size()-1; i >=0 ; i--) {
            int sayi=list.get(i);
            if (sayi%2==0){
                list.remove(i);


            }
        }
        System.out.println("Cift Sayilar silinmis liste:"+list);
        Collections.sort(list);
        System.out.println("artarak siralanmis Liste:"+list);
    }
}
