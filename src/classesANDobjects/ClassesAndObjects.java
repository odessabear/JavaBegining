package classesANDobjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Tom");
        person1.setAge(-5);
        person1.speak();



    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()){
            System.out.println("empty name");
        }else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge<=0){
            System.out.println("age can't be less or equal 0!");
        }else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }


    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    void speak() {
        System.out.println("My name is " + name + " I am " + age + " years old");
    }

    void sayHello() {
        System.out.println("Hello!");
    }
}
