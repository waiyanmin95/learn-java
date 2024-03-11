package compro.Isolate;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;

public class SqureAndQube {
    public static int isIsolated(long n) {
        Instant start_time = Instant.now();
        if ( n > 2097151 || n < 1 ) {
            return -1;
        }
        long square = n * n;
        long cube = square * n;
        HashSet<Long> set = new HashSet<>();
        while ( cube > 0 ) {
            long i = cube % 10;
            set.add(i);
            cube = cube / 10;
        }
        while( square > 0 ) {
            long i = square % 10;
            if (set.contains(i)) {
                return 0;
            }
            square = square /10;
        }
        Instant stop_time = Instant.now();
        System.out.println(Duration.between(start_time, stop_time).toNanos()+"ns");
        return 1;
    }

    public static int isIsolatedGod(long n) {
        Instant start_time = Instant.now();
        if (n < 1 || n > 2097151) {
            return -1;
        }
        long square = n * n;
        long cube = square * n;
        String strSquare = String.valueOf(square);
        String strCube = String.valueOf(cube);
        for(int i = 0 ; i < strSquare.length(); i++) {
            for(int k = 0; k < strCube.length(); k++) {
                if(strSquare.charAt(i) == strCube.charAt(k)) {
                    return 0;
                }
            }
        }
        Instant stop_time = Instant.now();
        System.out.println(Duration.between(start_time, stop_time).toNanos()+"ns");
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isIsolated(163));
        System.out.println(isIsolatedGod(163));
    }
}

