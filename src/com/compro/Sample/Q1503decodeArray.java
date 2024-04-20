package compro.Sample;

public class Q1503decodeArray {

    public static int power(int base, int pow) {
        int result = 1;
        while (pow != 0) {
            result = result * base;
            pow--;
        }
        return result;
    }

    public static int decodeArray(int[] a) {


        int decode = 0;
        for (int i = 0; i < a.length - 1; i++) {
//            System.out.println("J: " + j);
            int temp = a[i] - (a[i + 1]);
            if (temp < 0) {
                temp = temp * -1;
            }
            decode += temp * power(10, a.length - 2 - i);

        }
        if (a[0] < 0) {
            return decode * -1;
        }
        return decode;
    }

    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));

    }
}
