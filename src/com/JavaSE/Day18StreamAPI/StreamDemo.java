package JavaSE.Day18StreamAPI;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(23);
        list.add(85);
        list.add(-99);
        list.add(-3);
        list.add(101);

        Stream<Integer> s = list.stream();
        Optional<Integer> min = s.min(Integer::compareTo);

        if ( min.isPresent()) {
            System.out.println("Minimum is " + min.get());
        }

        s = list.stream();
        Optional<Integer> max = s.max(Integer::compareTo);
        max.ifPresent(System.out::println);

        s = list.stream();
        s.forEach(x -> System.out.println("X is "+x));

        s = list.stream().sorted();
        s.forEach(x -> System.out.println("Sorted X is "+x));

        System.out.println("=========================");

        // The Original order multiplied by 2.
        // Map > transform > return same size as original
        s = list.stream().map(x -> x * 2);
        s.forEach(x -> System.out.println("OX multiplied by 2 is "+x));

        System.out.println("=========================");

        // Sorted order multiplied by 2
        s = list.stream().sorted().map(x -> x * 2);
        s.forEach(x -> System.out.println("SX multiplied by 2 is "+x));

        System.out.println("=========================");

        // Filter > Predicate Function (Boolean Return)
        s = list.stream().filter(x -> x % 2 == 0);
        s.forEach(x -> System.out.println("Filtered X is "+x));

        System.out.println("=========================");

        // Filter Chain/Pipeline with Map
        s = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2);
        s.forEach(x -> System.out.println("Chained X is "+x));
    }
}
