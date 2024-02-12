package turing.JavaSE.Day18StreamAPI;

import java.util.Optional;

interface Increase {
    int func(int x);
}
public class OptionalDemo {

    public static void main(String[] args) {
        Integer i = 2;

        Optional<Integer> data = Optional.ofNullable(i);

        Optional<Integer> result = data.map(x -> x + 1).map(x -> x * 2);
        // if (result.isPresent()) {
        //    System.out.println(result.get());
        // }  Same same
        result.ifPresent(System.out::println);
    }
}
