package classesANDobjects;

public class WordTHIS {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setName("Tom");
        human1.setAge(18);
        human1.getInfo();
    }
}

class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return getAge();
    }

    public void getInfo() {
        System.out.println(name + " , " + age);
    }

}
