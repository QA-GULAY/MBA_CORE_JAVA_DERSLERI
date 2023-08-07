package Day_23;

public class IkiArrayin_ilk_elemanlarini_dondurme {
    public static void main(String[] args) {
        int[] arr_1 = {11, 12, 13, 14, 15};
        int[] arr_2 = {19, 17, 18, 14, 15};
        int toplam =toplam(arr_1,arr_2);
        System.out.println("toplam:"+toplam);

    }


    public static int toplam(int[] arr_1, int[] arr_2) {

        int ilkEleman_1 = arr_1[0];
        int ikinciEleman = arr_2[0];
        int toplam= ilkEleman_1 + ikinciEleman;
        return toplam;
    }


}
