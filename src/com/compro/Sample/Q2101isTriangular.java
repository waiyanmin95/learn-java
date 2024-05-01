package compro.Sample;

public class Q2101isTriangular {
    public static int isTriangular(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
            if (result == n) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isTriangular(6));
    }
}
