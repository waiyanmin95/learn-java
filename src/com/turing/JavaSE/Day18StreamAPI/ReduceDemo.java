package turing.JavaSE.Day18StreamAPI;

import java.util.ArrayList;

public class ReduceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(23);
        list.add(85);
        list.add(-99);
        list.add(-3);
        list.add(101);

        // Integer total = list.stream().reduce(0, (a,b) -> {
        //    System.out.println("A "+a+" B "+b);
        //    return a + b;
        // });
        Integer total = list.stream().reduce(0, Integer::sum);
        System.out.println("Total: "+total);
        System.out.println("=========================");

        Integer min = list.stream().reduce(0, (a,b) -> {
            System.out.println("A "+a+" B "+b);
            return a>b?b:a; // booleanExpression ? valueIfTrue : valueIfFalse;
        });
        System.out.println("Minimum: "+min);
        System.out.println("=========================");

        Integer max = list.stream().reduce(0, (a,b) -> {
            System.out.println("A "+a+" B "+b);
            return a>b?a:b; // booleanExpression ? valueIfTrue : valueIfFalse;
        });
        System.out.println("Maximum: "+max);
    }
}
