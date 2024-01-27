package compro.SumFactor;

public class Q14SumFactor {
    public static int sumFactor(int[] n) {
        int sum = 0;

        for (int num: n) {
            sum += num;
        }
        int resultCount = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == sum) {
                resultCount++;
            }
        }
        return resultCount;
    }

    public static void main(String[] args) {
        int[] test1 =  {1, -1, 1, -1, 1, -1, 1};
        int[] test2 = { 1, 2, 3, 4};
        System.out.println(sumFactor(test1));
        System.out.println(sumFactor(test2));
    }
}
