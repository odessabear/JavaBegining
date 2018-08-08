package basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input something");

        String string = scanner.nextLine();
        int x = scanner.nextInt();
        System.out.println("You entered " + string + x);
    }
}
