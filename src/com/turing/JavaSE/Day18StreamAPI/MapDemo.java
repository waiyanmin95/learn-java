package turing.JavaSE.Day18StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        ArrayList<String> strlist = new ArrayList<>();
        strlist.add("Hello");
        strlist.add("Lemon");
        strlist.add("Banana");
        strlist.add("Apple");
        strlist.add("Grape");

        // Stream<String> upperCaseList = strlist.stream().map(String::toUpperCase);
        Stream<String> upperCaseList = strlist.stream().map(x-> x.toUpperCase());
        upperCaseList.forEach(System.out::println);

        Stream<String> lengthList = strlist.stream().map(x-> x+"["+x.length()+"]");
        lengthList.forEach(System.out::println);

        // List<Integer> list = strlist.stream().map(String::length).toList();
        List<Integer> list = strlist.stream().map(x->x.length()).collect(Collectors.toList());

        for (Integer i: list ) {
            System.out.println("I is "+i);
        }
    }
}
