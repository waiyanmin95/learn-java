package random.Quizes;
public class Q1 {

    public static int multipleOfThreeFive(int a, int b) {
        int multiThree = 0;
        int multiFive = 0;
        for (int i = a; i < 1000; i+=a) {
            multiThree += i;
        }
        for (int i = b; i < 1000; i+=b) {
            if ( i%a != 0 ) {
                multiFive += i;
            }
//            if ( multiFive == ( a * i )) {
//                multiFive =- ( a * i );
//            }
        }
        System.out.println(multiThree + " " + multiFive);
        return multiThree + multiFive;
    }
    public static int simple(int a, int b) {
        int num = 1000;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if ( i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println(multipleOfThreeFive(3, 5));
        System.out.println(simple(3, 5));
    }
}
