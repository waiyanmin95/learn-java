package compro.Sample.Set2;

public class Q2103isBunker {
    public static int isBunker(int n) {
        int i = 0;
        int v = 1;
        while (i <= n) {
            v = v + i;
            if (v == n) {
                return 1;
            } else if (v > n) {
                break;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isBunker(11));
    }
}
