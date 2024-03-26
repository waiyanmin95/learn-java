package compro.Sample;

public class Q9GuthrieIndex {
    public static int GuthrieIndex(int n) {
        if ( n <= 0 ) {
            return 0;
        }
        int temp = n;
        int count = 0;
        while (temp != 1) {
            if ( temp % 2 == 0 ) {
                temp = temp / 2;
            } else {
                temp = (temp * 3) + 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(GuthrieIndex(1));
        System.out.println(GuthrieIndex(2));
        System.out.println(GuthrieIndex(3));
        System.out.println(GuthrieIndex(4));
        System.out.println(GuthrieIndex(42));
        System.out.println(GuthrieIndex(0));
    }
}
