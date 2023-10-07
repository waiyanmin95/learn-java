package JavaSE.Day5Operators;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        // 1 - Sunday
        // 2 - Monday
        // 3 - Tuesday
        // 4 - Wednesday
        // 5 - Thursday
        // 6 - Friday
        // 7 - Saturday
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day in number: ");
        int day = scanner.nextInt();

        // Default Fallthrough
        switch (day) {
            case 1, 7:
                System.out.println("Holidays");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("This is default");
        }
    }
}
