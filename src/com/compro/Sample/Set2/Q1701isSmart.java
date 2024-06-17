package compro.Sample.Set2;

public class Q1701isSmart {
    public static int isSmart(int n) {
        int i = 0;
        int k = 1;
        while (i <= n) {
            k += i;
            if (k == n) {
                return 1;
            } else if (k > n) {
                break;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isSmart(11));
        System.out.println(isSmart(22));
        System.out.println(isSmart(2));
        System.out.println(isSmart(1));
//        System.out.println(isSmart(15));
    }
}
