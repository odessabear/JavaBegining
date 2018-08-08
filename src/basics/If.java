package basics;

public class If {
    public static void main(String[] args) {
        int myInt = 5;
        if (myInt < 10) {
            System.out.println("It's true");
        } else if (myInt < 20) {
            System.out.println("it's a lie");
        } else {
            System.out.println("it's can't be so");
        }
    }
}
