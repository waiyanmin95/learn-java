package JavaSE.Exercises;

import java.util.Scanner;

public class Solution1 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            }
            if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            }
            if (N >= 21) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }
}
