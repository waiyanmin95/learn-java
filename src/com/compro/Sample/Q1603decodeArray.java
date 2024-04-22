package compro.Sample;

public class Q1603decodeArray {
    public static int decodeArray(int[] a) {
        int result = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            int zeroCount = 0;
            index = i;
            while (a[index] == 0 && index < a.length - 1) {
                zeroCount++;
                index++;
            }
            i = index;

            result = (result * 10) + zeroCount;
        }
        if (a[0] == -1) {
            result = result * -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{0, 0, 0, 0, 1, 0, 0, 1};
        int[] test2 = new int[]{0, 1, 1, 1, 1, 1, 0, 1};
        System.out.println(decodeArray(test1));
        System.out.println(decodeArray(test2));
    }
}
