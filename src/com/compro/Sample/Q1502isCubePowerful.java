package compro.Sample;

public class Q1502isCubePowerful {

    public static int power(int base, int pow) {
        int result = 1;
        while (pow != 0) {
            result = result * base;
            pow--;
        }
        return result;
    }

    public static int isCubePowerful(int n) {
        if (n <= 0) {
            return 0;
        }
        int temp = n;
        int result = 0;
        while (temp > 0) {
            result += power((temp % 10), 3);
            temp = temp / 10;
        }
        System.out.println("N is : " + n + " AND " + "Result: " + result);
        if (result != n) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }
}
