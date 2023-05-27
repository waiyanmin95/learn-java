package JavaSE.Day22;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("r.nextInt(100, 1000) = " + r.nextInt(100, 1000));
        System.out.println("r.nextInt(10) = " + r.nextInt(10));
    }
}
