package basics;

import java.util.Scanner;

public class SwitchMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("You was born");
                break;
            case 7:
                System.out.println("You a pupil");
                break;
            case 18:
                System.out.println("You finished school");
                break;
//            default:
//                System.out.println("Not good ");
        }
    }
}
