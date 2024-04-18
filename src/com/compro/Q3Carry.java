package compro;

import java.util.Arrays;

public class Q3Carry {
    public static int[] updateMileage(int[] milage, int miles) {
        int carry = miles;

        for (int i = 0; i < milage.length; i++) {
            int newValue = milage[i] + carry;
            milage[i] = newValue % 10;
            carry = newValue / 10;
        }
        return milage;
    }

    public static void main(String[] args) {
        int[] one = {8, 9, 9, 5, 0};
        int[] two = {8, 9, 9, 5, 0};
        int[] three = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] four = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(updateMileage(one, 1)));
        System.out.println(Arrays.toString(updateMileage(two, 2)));
        System.out.println(Arrays.toString(updateMileage(three, 1)));
        System.out.println(Arrays.toString(updateMileage(four, 13)));
    }
}