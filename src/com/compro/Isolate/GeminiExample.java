package compro.Isolate;

public class GeminiExample {
    public static int isIsolated(long n) {
        // Check for numbers outside the valid range
        if (n <= 0 || n > 2097151) {
            return -1;
        }

        // Set to store digits seen in the square
        int[] seenDigits = new int[10];

        // Extract digits of n and populate seenDigits for the square
        while (n > 0) {
            int digit = (int) (n % 10);
            seenDigits[digit]++; // Mark digit seen in the square
            n /= 10; // Shift digits right (discard rightmost)

            // Square the digit and update seenDigits again
            int squaredDigit = digit * digit;
            while (squaredDigit > 0) {
                int squareDigit = squaredDigit % 10;
                seenDigits[squareDigit]++;
                squaredDigit /= 10;
            }
        }

        // Check cube digits against seenDigits in the square
        n = n * n; // Calculate the cube
        while (n > 0) {
            int digit = (int) (n % 10);
            if (seenDigits[digit] > 0) { // Digit present in both square and cube
                return 0; // Not isolated
            }
            n /= 10;
        }

        // No overlap found, return isolated
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isIsolated(163)); // 1 (Isolated)
        System.out.println(isIsolated(162)); // 0 (Not Isolated)
        System.out.println(isIsolated(0)); // -1 (Invalid Input)
    }
}
