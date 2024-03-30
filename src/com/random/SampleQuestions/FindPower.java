package random.SampleQuestions;

public class FindPower {
    public static int power(int base, int pow) {
        if ( base <= 0 ) {
            return 0;
        }
        if ( pow == 0 ) {
            return 1;
        }
        return base * power(base, pow - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(10,  0));
    }
}
