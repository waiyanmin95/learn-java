package turing.JavaSE.Day15Wrapper;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        // Under the hood
        // Object = root of every object
        // ArrayList<Object> list = new ArrayList<Object>();
        ArrayList<String> xi = new ArrayList<>();
        xi.add("Hello");
        xi.add("Tom");
        xi.add("Jerry");
        System.out.println("String ArrayList: "+xi);

        /* no type safety
        */
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(12);
        System.out.println("No Type Safety: "+list);

        ArrayList<Integer> ii = new ArrayList<>();
        ii.add(1);
        ii.add(3);
        ii.add(5);
        System.out.println("Integer ArrayList: "+ii);
        System.out.println(ii.getClass());
    }
}
