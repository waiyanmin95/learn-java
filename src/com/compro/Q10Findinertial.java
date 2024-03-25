package compro;

import java.util.ArrayList;
import java.util.List;

public class Q10Findinertial {
    static int isInertialGod(int[] a) {
        if(a.length < 2) {
            return 0;
        }
        //find the odd
        boolean odd = false;
        boolean maxisEven = false;
        int max = 0;
        ArrayList<Integer> oddsArr = new ArrayList<>();
        ArrayList<Integer> evensArr = new ArrayList<>();
        for( int i = 0 ; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                if( max % 2 == 0 ) {
                    maxisEven = true;
                }
            }
            if( a[i] % 2 != 0) {
                odd = true;
                oddsArr.add(a[i]);
            }
            if( a[i] != max && a[i] % 2 == 0) {
                evensArr.add(a[i]);
            }
        }

        for (int k = 0 ; k < oddsArr.size(); k++) {
            for (int y = 0 ; y < evensArr.size(); y++) {
                if (oddsArr.get(k) < evensArr.get(y)) {
                    return 0;
                }
            }
        }

        if( odd && maxisEven) {
            return 1;
        }
        return 0;
    }
    public static int isInertial(int[] arr) {
        if ( arr.length <= 1 ) {
            return 0;
        }
        int even = 0;
        int odd = 0;
        int max = 0;

        List<Integer> evenArr = new ArrayList<>();
        List<Integer> oddArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max ) {
                max = arr[i];
            }
            if ( arr[i] % 2 ==  0) {
                evenArr.add(arr[i]);
                even++;
            } else {
                oddArr.add(arr[i]);
                odd++;
            }
        }

        for (Integer o : oddArr) {
            for (Integer e: evenArr) {
                if ( e != max ) { // if e == max > skip the loop
                    if (e > o ) {
                        return 0;
                    }
                }
            }
        }

        if ( (max % 2 == 0) && (odd >= 1) ) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] test1 = {11, 4, 20, 9, 2, 8}; // 1
        int[] test2 = {12, 11, 4, 9, 2, 3, 10}; // 0
        int[] test3 = {12, 11, 4, 9, 2, 7, 3, 10}; // 0
        int[] test4 = {12, 11, 4, 9, 2, 7, 6}; // 1
        int[] allzero = {0, 0, 0, 0, 0, 0}; // 0
        System.out.println("Own: "+isInertial(test1));
        System.out.println("Own: "+isInertial(test2));
        System.out.println("Own: "+isInertial(test3));
        System.out.println("Own: "+isInertial(test4));
        System.out.println("Own all zero: "+isInertial(allzero));

        System.out.println("God: "+isInertialGod(test4));
        System.out.println("God all zero: "+isInertialGod(allzero));
    }
}
