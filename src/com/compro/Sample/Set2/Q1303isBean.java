package compro.Sample.Set2;

public class Q1303isBean {
    public static int isBean(int[] a) {
        boolean isContainNine = false;
        boolean isContainThirdteen = false;
        boolean isContainSeven = false;
        boolean isContainSixteen = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                isContainNine = true;
            }
            if (a[i] == 13) {
                isContainThirdteen = true;
            }
            if (a[i] == 7) {
                isContainSeven = true;
            }
            if (a[i] == 16) {
                isContainSixteen = true;
            }
        }
        if ((isContainNine && isContainThirdteen || isContainSeven && !isContainSixteen) || (!isContainNine && !isContainThirdteen && !isContainSeven && !isContainSixteen)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isBean(new int[]{1, 2, 3, 9, 6, 13}));
        System.out.println(isBean(new int[]{3, 4, 6, 7, 13, 15}));
        System.out.println(isBean(new int[]{1, 2, 3, 4, 10, 11, 12}));
        System.out.println(isBean(new int[]{3, 6, 9, 5, 7, 13, 6, 17}));
        System.out.println(isBean(new int[]{9, 6, 18}));
        System.out.println(isBean(new int[]{4, 7, 16}));
    }
}
