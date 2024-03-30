package random.SampleQuestions;

public class isSquare {
    public static int isSquarE(int n) {
        int temp = 1;
        while ( temp * temp < n) {
            temp++;
        }

        return temp * temp == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquarE(4));
        System.out.println(isSquarE(25));
        System.out.println(isSquarE(-4));
        System.out.println(isSquarE(8));
        System.out.println(isSquarE(0));
    }
}
