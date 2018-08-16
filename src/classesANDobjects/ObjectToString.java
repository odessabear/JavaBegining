package classesANDobjects;

public class ObjectToString {
    public static void main(String[] args) {
        Human3 human3 = new Human3("Bob", 40);

        System.out.println(human3);
    }
}

class Human3 {
    private String name;
    private int age;

    public Human3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "," + age;
    }
}