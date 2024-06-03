package compro.Sample.Set2;

public class Q1601isContinuousFactored {
    public static int isContinuousFactored(int n) {
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0 && n % (i + 1) == 0) {
                System.out.println(i + " " + (i + 1));
                return 1;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(60));
//        System.out.println(isContinuousFactored(120));
//        System.out.println(isContinuousFactored(90));
//        System.out.println(isContinuousFactored(99));
//        System.out.println(isContinuousFactored(121));
//        System.out.println(isContinuousFactored(2));
//        System.out.println(isContinuousFactored(13));
    }
}
