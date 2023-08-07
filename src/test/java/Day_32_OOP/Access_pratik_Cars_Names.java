package Day_32_OOP;

import Day_32_OOP.Packege1.Names;

public class Access_pratik_Cars_Names {

    public static void main(String[] args) {

        Cars cars=new Cars(25);

        //System.out.println(cars.id); id sorun veiyor cunki id  Cars classinda privete veriable
        //privete yanlizca ayni class icinde cagrilir, en kisitlayici access

         cars.test();

        Names names=new Names("Ahmet");  //protected keywordu daha esnek baska classtan ayni pakette cagirabiliyoruz
        names.test();
    }
}
