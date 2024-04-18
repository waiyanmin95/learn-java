package compro.Sample;

public class Q503nUnique {
    public static int isNUnique(int[] a, int n) {
        if (a.length < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
//                System.out.println("I: "+a[i] + " " +"J: "+a[j] + " Sum: " + (a[i] + a[j]) ) ;
                if (a[i] + a[j] == n && i != j) {
                    count++;
                }
            }
        }
        return count == 1 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4));
        System.out.println(isNUnique(new int[]{1}, 4));
        System.out.println(isNUnique(new int[]{0, 0, 0, 0}, 0));
        System.out.println(isNUnique(new int[]{}, 0));
    }
}
