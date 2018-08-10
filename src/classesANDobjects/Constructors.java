package classesANDobjects;

public class Constructors {
    public static void main(String[] args) {

        Human2 human2 = new Human2("Bob", 40);
        human2.printAllPeople();
        Human2 human1 = new Human2("Tom", 30);
        human1.printAllPeople();
        Human2 human3 = new Human2("Jack",25);
        human3.printAllPeople();



    }
}

class Human2 {
    private String name;
    private int age;
    private static int countPeople;


    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void printAllFields() {
        System.out.println();
    }

    public void printAllPeople() {
        System.out.println("number of people " + countPeople);
    }
}
