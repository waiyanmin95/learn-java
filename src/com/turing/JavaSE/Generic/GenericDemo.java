package turing.JavaSE.Generic;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        // Short Declaration
        ArrayList<String> xi = new ArrayList<>();
        xi.add(0, "A");
        xi.add("B"); // 1
        xi.add("C"); // 2
        xi.add(3, "D");
        System.out.println(xi);

        ArrayList<Integer> xxi = new ArrayList<Integer>();
        xxi.add(1);
        xxi.add(2);
        xxi.add(3);
        xxi.remove(0);
        System.out.println(xxi);
    }
}
