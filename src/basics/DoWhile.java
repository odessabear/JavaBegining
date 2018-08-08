package basics;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Input value");
            value = scanner.nextInt();
            System.out.println("Your input is " + value);
        } while (value != 5);
        System.out.println("You entered 5");
    }
}
