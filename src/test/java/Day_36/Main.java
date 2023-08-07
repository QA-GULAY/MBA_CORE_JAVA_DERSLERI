package Day_36;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Ahmet",34);

        System.out.println(student.getName());

        System.out.println(student.getAge());

        student.setName("Mehmet");
        System.out.println(student.getName());

        student.setAge(89);
        System.out.println(student.getAge());

       Teachers teachers=new Teachers("Ferruh Dogan",57);

        System.out.println(teachers.getName());
        teachers.setName("Bengu");
        System.out.println(teachers.getName());
        System.out.println(teachers);

    }
}
