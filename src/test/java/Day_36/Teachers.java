package Day_36;

public class Teachers {
    String name;
    int  age;

    public Teachers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bilgiler: {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
