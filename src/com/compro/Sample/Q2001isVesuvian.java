package compro.Sample;

public class Q2001isVesuvian {
    public static int isVesuvian(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n / 2; j++) {
                if (n == ((i * i) + (j * j))) {
                    count++;
                    System.out.println("I: " + i + " and " + "J: " + j);
                    break;
                }
                if (count == 2) {
                    return 1;
                }
            }
        }
//        System.out.println("========");
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(85));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(18));
    }
}
