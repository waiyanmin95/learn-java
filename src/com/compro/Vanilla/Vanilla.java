package compro.Vanilla;

public class Vanilla {
    public static int isVanilla(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int num = a[0] % 10;
        for (int i = 0; i < a.length; i++) {
            String each = String.valueOf(a[i]); // get the length of each element
            int temp = a[i]; // holder for modification
            for (int j = 0; j < each.length(); j++) { // loop through each element of the holder
                if (temp % 10 != num) {
                    return 0;
                }
                temp = temp / 10;
            }

        }
        return 1;
    }

    public static int isVanillaWhile(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int num = a[0] % 10;
        for (int i = 0; i < a.length; i++) {
            int temp = a[i]; // holder for modification
            while (true) {
                if (temp % 10 != num) {
                    return 0;
                }
                temp = temp / 10;
                if (temp == 0) {
                    break;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 1, 111, 11111};
        int[] test2 = new int[]{1, 1, 111, 11011, 11111};
        int[] test3 = new int[]{1, 0, 111, 11011, 11111};
        int[] naked = new int[]{};
        System.out.println(isVanilla(test1));
        System.out.println(isVanilla(test2));
        System.out.println(isVanilla(test3));
        System.out.println(isVanilla(naked));

        System.out.println("=========");
        System.out.println(isVanillaWhile(test1));
        System.out.println(isVanillaWhile(test2));
        System.out.println(isVanillaWhile(test3));
        System.out.println(isVanillaWhile(naked));
    }
}
