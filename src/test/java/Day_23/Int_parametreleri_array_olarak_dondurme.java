package Day_23;

public class Int_parametreleri_array_olarak_dondurme {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        int z=9;
        int t=2;
        int k=7;
      int[] dondurulenArray=ArrayOlustur(x,y,z,t,k);
        for (int arr:dondurulenArray) {
            System.out.println("Dondurulen Array:"+arr);

        }


    }
     public static int[] ArrayOlustur(int x,int y,int z,int t,int k){
      //  int []array={x,y,z,t,k};        1.yol
         int[]array=new int[5];     //    2.yol
         array[0]=x;
         array[1]=y;
         array[2]=z;
         array[3]=t;
         array[4]=k;
        return array;

     }










}
