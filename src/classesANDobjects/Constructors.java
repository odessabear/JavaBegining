package classesANDobjects;

public class Constructors {
    public static void main(String[] args) {
        Human2 human2 = new Human2(" what");

    }
}

class Human2 {
    private String name;
    private int age;

    public Human2() {
        System.out.println("Hello from default constructor!");
    }

    public Human2(String name) {
        System.out.println("Hello from second constructor!");

        this.name = name;
    }

    public Human2(String name, int age) {
        System.out.println("Hello from third constructor!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
