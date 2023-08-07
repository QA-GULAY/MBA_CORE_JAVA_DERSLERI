package Day_11;

public class Practise_methad {
    public static void main(String[] args) {
        shape();
        pramid();

    }

    public static void shape() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("#");

            }
            System.out.println();
        }


            }
            public static void pramid(){
                for (int i = 0; i <4 ; i++) {
                    for (int j = 0; j <i ; j++) {
                        System.out.print("*");

                    }
                    System.out.println();
                }
            }
        }



