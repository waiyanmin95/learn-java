package compro.Sample.Set2;

public class Q7002findSmallestBEQ {
    public static int findSmallestBEQnumber() {
        int n = 1;
        int cube = 0;
        while (true) {
            cube = n * n * n;
            int counter = 0;
            while (cube > 0) {
                if (cube % 10 == 6) {
                    counter++;
                }
                cube = cube / 10;
            }
            if (counter == 4) {
                break;
            }
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestBEQnumber());
    }
}
