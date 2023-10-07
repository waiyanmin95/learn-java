package JavaSE.Day6ControlFlow;

import java.util.Random;
import java.util.Scanner;

public class DoWhileRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        // Will Get 0-9, not included upper bound 10
        // After Added 1, will get 1-10
        int number = random.nextInt(10) + 1;

        System.out.println("Number: " + number);

        boolean correct = false;
        int attempt = 0;
        // DoWhile run at least once, check condition at that end
        do {
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();
            attempt++;
            if (guess == number) {
                correct = true;
                System.out.println("You guess it correctly at attempt " + attempt);
            } else if (guess > number) {
                System.out.println("Your guess is high");
            } else {
                System.out.println("Your guess is low");
            }
        } while (!correct);
    }
}
