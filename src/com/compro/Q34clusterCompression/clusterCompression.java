package compro.Q34clusterCompression;

import java.util.Arrays;

public class clusterCompression {
    public static int[] ClusterCompression(int[] a) {
        if (a.length == 0) {
            return new int[]{};
        }
        int numClusters = 1; // original cluster
        int prev = a[0]; // set check value
        for (int i = 0; i < a.length; i++) {
            if (prev != a[i]) {
                numClusters++;
                prev = a[i];
            }
        }
        int[] result = new int[numClusters];
        int index = 0;

        prev = a[0];
        for (int i = 0; i < a.length; i++) {
            if (prev != a[i]) {
                index++;
                result[index] = a[i];
                prev = a[i];
            } else {
                result[index] = prev;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{3, 3, 3, 3, 4, 4, 2, 2, 2, 2, 4};
        int[] one = new int[]{3};
        int[] naked = new int[]{};
        int[] allsame = new int[]{1, 1, 1, 1, 1};
        int[] alldiff = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ClusterCompression(test1)));
        System.out.println(Arrays.toString(ClusterCompression(one)));
        System.out.println(Arrays.toString(ClusterCompression(naked)));
        System.out.println(Arrays.toString(ClusterCompression(allsame)));
        System.out.println(Arrays.toString(ClusterCompression(alldiff)));
    }
}
