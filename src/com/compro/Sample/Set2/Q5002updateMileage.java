package compro.Sample.Set2;

import java.util.Arrays;

public class Q5002updateMileage {
    static void updateMileage(int[] a, int miles) {
        int carry = miles;
        
        for (int i = 0; i < a.length; i++) {
            int temp = a[i] + carry;
            a[i] = temp % 10;
            carry = temp / 10;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        updateMileage(new int[]{8, 9, 9, 5, 0}, 1);
        updateMileage(new int[]{8, 9, 9, 5, 0}, 2);
        updateMileage(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1);
        updateMileage(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 13);
    }
}
