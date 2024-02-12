package turing.JavaSE.Day18StreamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> strlist = new ArrayList<>();
        strlist.add("Hello");
        strlist.add("Lemon");
        strlist.add("Banana");
        strlist.add("Apple");
        strlist.add("Grape");
        strlist.add("Watermelon");

        Iterator<String> i = strlist.stream().iterator();
        while ( i.hasNext()) {
            System.out.println("Next: "+i.next());
        }
        System.out.println("=========================");

        Spliterator<String> si = strlist.stream().spliterator();
        // tryAdvance = hasNext + nextR
        while ( si.tryAdvance(System.out::println) );
        System.out.println("=========================");

        si = strlist.stream().spliterator();
        Spliterator<String> si2 = si.trySplit();
        si.forEachRemaining(x -> System.out.println("X: "+x));

        if ( si2 != null ) {
            si2.forEachRemaining(x -> System.out.println("Another X: "+x));
        }
    }
}
