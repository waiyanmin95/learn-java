package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] xi = {1, 2, 3};
        System.out.println(xi[1]);
        System.out.println(xi.length);

        xi[0] = 22;
        for (int i : xi) {
            System.out.printf("Index values: %s\n", i);
        }
    }
}
