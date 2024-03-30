package compro.Sample;

public class Q601isSquare {
    public static int isSquare(int n) {
        int temp = 0;
        while ( temp * temp < n) {
            temp++;
        }
        return temp * temp == n ? 1:0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
        System.out.println(isSquare(100));
        System.out.println(isSquare(121));
        System.out.println(isSquare(122));
        System.out.println(isSquare(144));
        System.out.println(isSquare(169));
    }
}
