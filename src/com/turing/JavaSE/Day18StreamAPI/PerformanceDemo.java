package turing.JavaSE.Day18StreamAPI;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class PerformanceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();
        for ( int i=0; i < 100000000; i++) {
            list.add(r.nextInt(100000));
        }

        double pstart = System.currentTimeMillis();
        Optional<Integer> pmax = list.parallelStream().max(Integer::compare);
        double pend = System.currentTimeMillis();

        double pduration = pend - pstart;
        System.out.println("Parallel Duration in ms: "+pduration);

        double start = System.currentTimeMillis();
        Optional<Integer> max = list.stream().max(Integer::compare);
        double end = System.currentTimeMillis();

        double duration = end - start;
        System.out.println("Duration in ms: "+duration);
    }
}
