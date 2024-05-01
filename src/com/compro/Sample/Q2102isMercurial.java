package compro.Sample;

public class Q2102isMercurial {
    public static int isMercurial(int[] a) {
        int first = 0;
        int next = 0;
        int oneCount = 0;
        int threeIndex = 0;
        int j = a.length - 1;
        for (int i = 0; i < j; i++, j--) {
            if (a[i] == 1) {
                first = i;
                oneCount++;
            }
            if (a[j] == 1) {
                next = j;
                oneCount++;
            }
            if (a[i] == 3 || a[j] == 3) {
                threeIndex = j;
            }
        }
//        System.out.println(first + " " + threeIndex + " " + next);
//        System.out.println(oneCount);
//        System.out.println("T: " + threeIndex);

        if (oneCount > 1 && threeIndex > first && threeIndex < next) {
            return 0;
        }
        return 1;
    }

//    public static int isMercurial(int[] a) {
//
//        boolean precedingOneFlag = false;
//
//        int indexOf3 = -1;
//        int indexOf1 = -1;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 1)
//                indexOf1 = i;
//
//            if (a[i] == 3) {
//                indexOf3 = i;
//            }
//
//            if (indexOf1 != -1 && indexOf3 > indexOf1)
//                precedingOneFlag = true;
//
//            if (precedingOneFlag && a[i] == 1)
//                return 0;
//        }
//
//        return 1;
//    }

    public static void main(String[] args) {

        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18}));
        System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
        System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isMercurial(new int[]{1}));
        System.out.println(isMercurial(new int[]{}));
    }
}
