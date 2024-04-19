package compro.Sample;

import java.util.Arrays;

public class Q1402encodeNumber {
    public static int[] encodeNumber(int n) {
        if (n <= 1) {
            return null;
        }
        int temp = 0;
        int factor = n;
        int size = 0;

        while (temp <= n) {
            while (isPrime(temp) && factor % temp == 0) {
                factor = factor / temp;
                size++;
            }
            temp++;
        }
        int[] result = new int[size];

        int i = 0;
        int facftor = n;
        int index = 0;
        while (i <= n) {
            if (isPrime(i)) {
                while ((facftor % i == 0)) {
                    if (facftor % i == 0) {
                        facftor = facftor / i;
                        result[index] = i;
                        index++;
                    }
                }
            }
            i++;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(6936)));
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(-1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }
}
