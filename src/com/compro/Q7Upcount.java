package compro;

//Q7: Define the n-up count of an array to be
// the number of times
// the partial sum goes from less than or equal to n
// to greater than n
// during the calculation of the sum of the elements of the array.
//
// For example, if n=5, the 5-upcount of the array {2, 3, 1, -6, 8, -3, -1, 2} is 3.
public class Q7Upcount {
    public static int Upcount(int[] arr, int n) {
        int partialsum = 0;
        int lastpartialsum = 0;
        int count = 0;

        for (int j : arr) {
            lastpartialsum = partialsum;
            partialsum += j;
            if (lastpartialsum <= n && partialsum > n) {
                count++;
            }
        }
        return count;
    }

    static int nUpCount(int[] a, int n){
        int nUpCount = 0;
        int partialSum = 0;
        int previousPartialSum = 0;
        for(int i=0; i<a.length; i++){
            previousPartialSum = partialSum;
            partialSum += a[i];
            if(previousPartialSum <= n && partialSum > n){
                nUpCount++;
            }
        }
        return nUpCount;
    }
    public static void main(String[] args) {
        int[] test1 = {2, 3, 1, -6, 8, -3, -1, 2};
        int[] test2 = {2, 3, 5, 6, 7, 8};
        int[] test3 = {1, 1, 1, 1};
        System.out.println("Upcount: " +Upcount(test1, 4));
        System.out.println("Upcount: " +Upcount(test2, 10));
        System.out.println("Upcount: " +Upcount(test3, 5));
        System.out.println("Upcount: " +nUpCount(test2, 5));
    }
}
