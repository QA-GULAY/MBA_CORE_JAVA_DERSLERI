package Day_32_OOP;

import Day_32_OOP.Packege1.Names;

import javax.print.attribute.standard.MediaSize;

public class Main_Person {
    public static void main(String[] args) {
        Person person1 = new Person("Gulay", 43, "Spain");

        Person person2 = new Person("Arkadas", 23, "Turkiye");

        person1.printInfo();
        person2.printInfo();

    }
}
