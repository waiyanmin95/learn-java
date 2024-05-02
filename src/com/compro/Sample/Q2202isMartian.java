package compro.Sample;

public class Q2202isMartian {
    public static int isMartian(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        if (a[0] == 1 && a.length == 1) {
            return 1;
        }
        int oneCount = 0;
        int twoCount = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++, j++) {
            if (a[i] == 1) {
                oneCount++;
            }
            if (a[i] == 2) {
                twoCount++;
            }

            if (i == j) {
                j--;
            } else {
                if (a[j] == a[i]) {
                    return 0;
                }
            }
        }
//        System.out.println(twoCount + " " + oneCount);
        if (twoCount >= oneCount) {
            return 0;
        }
        return 1;
    }

    public static int isMartianAnother(int[] a) {
        int countOf1 = 0;
        int countOf2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1 && a[i] == a[i + 1]) { // main logic here
                return 0;
            }

            if (a[i] == 1) {
                countOf1++;
            }


            if (a[i] == 2) {
                countOf2++;
            }
        }

        if (countOf1 > countOf2) return 1;
        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(isMartian(new int[]{1, 3}));
//        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
//        System.out.println(isMartian(new int[]{1, 3, 2}));
//        System.out.println(isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5}));
//        System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2}));
//        System.out.println(isMartian(new int[]{}));
//        System.out.println(isMartian(new int[]{1}));
//        System.out.println(isMartian(new int[]{2}));
        System.out.println(isMartianAnother(new int[]{1, 1, 1, 2, 1, 2, 1, 2, 1}));

    }
}
