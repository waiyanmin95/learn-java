package compro.Sample.Set2;

public class Q2301isNormal {
    public static int isNormal(int n) {
        int i = 3;
        while (i < n) {
            if (n % i == 0) {
                return 0;
            }
            i += 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isNormal(1));
    }
}
