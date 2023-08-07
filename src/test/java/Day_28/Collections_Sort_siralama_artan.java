package Day_28;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Sort_siralama_artan {
    public static void main(String[] args) {           //collections.sort()

        ArrayList<Character>karakterler=new ArrayList<>();
        karakterler.add('d');
        karakterler.add('g');
        karakterler.add('a');
        karakterler.add('t');
        karakterler.add('b');
        karakterler.add('c');
        karakterler.add('u');

        System.out.println("orginal arrayList:"+karakterler);

        Collections.sort(karakterler);

        System.out.println("siralanmis liste="+karakterler);

        Collections.reverse(karakterler);
        System.out.println(   "Azalan liste:"+karakterler);


        //TASK 2
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(150);
        numbers.add(40);
        numbers.add(30);
        numbers.add(10);

        Collections.sort(numbers);

        System.out.println("Artan numaralar listesi:"+numbers);

        Collections.reverse(numbers);

        System.out.println("Azalan numaralar listesi:"+numbers);








    }
}
