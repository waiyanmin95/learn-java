package compro.Sample;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Q801isIsolated {
    public static int isIsolated(long n) {
        Instant start_time = Instant.now();
        long square = n * n;
        long cube = square * n;

        if ( cube > Long.MAX_VALUE) {
            return -1;
        }
        List<Long> cubeList = new ArrayList<>();
        while ( cube > 0) {
            cubeList.add(cube%10);
            cube /= 10;
        }

        List<Long> squareList = new ArrayList<>();
        while ( square > 0) {
            squareList.add(square%10);
            square /= 10;
        }

        for (int i = 0; i < cubeList.size(); i++) {
            for (int j = 0; j < squareList.size(); j++) {
                if ( squareList.get(j) == cubeList.get(i) ) {
                    return 0;
                }
            }
        }
        Instant stop_time = Instant.now();
        System.out.println(Duration.between(start_time, stop_time).toNanos()+" ns");
        return 1;
    }

    public static int isIsolatedSimple(long n) {
        Instant start_time = Instant.now();
        if ( n <= 0 || n > 2097151 ) {
            return -1;
        }

        long square = 0;
        long cube = 0;

        if ( n * n * n < Long.MAX_VALUE) {
            square = n * n;
            cube = n * n * n;
        } else {
            return -1;
        }

        while ( square > 0) {
            while ( cube > 0) {
                if ( cube % 10 == square % 10 ) {
                    return 0;
                }
                cube /= 10;
            }
            square /= 10;
        }
        Instant stop_time = Instant.now();
        System.out.println(Duration.between(start_time, stop_time).toNanos()+" ns");
        return 1;
    }

    public static void main(String[] args) {
//        System.out.println(isIsolated(2));
//        System.out.println(isIsolated(3));
//        System.out.println(isIsolated(8));
//        System.out.println(isIsolated(9));
//        System.out.println(isIsolated(14));
//        System.out.println(isIsolated(24));
//        System.out.println(isIsolated(28));
//        System.out.println(isIsolated(34));
//        System.out.println(isIsolated(58));
        System.out.println(isIsolated(163));
//        System.out.println(isIsolatedSimple(2097151));
//        System.out.println(isIsolatedSimple(2));
//        System.out.println(isIsolatedSimple(3));
//        System.out.println(isIsolatedSimple(8));
//        System.out.println(isIsolatedSimple(9));
//        System.out.println(isIsolatedSimple(14));
//        System.out.println(isIsolatedSimple(24));
//        System.out.println(isIsolatedSimple(28));
//        System.out.println(isIsolatedSimple(34));
//        System.out.println(isIsolatedSimple(58));
        System.out.println(isIsolatedSimple(163));
    }
}
