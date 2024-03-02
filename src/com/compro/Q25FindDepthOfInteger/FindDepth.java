package compro.Q25FindDepthOfInteger;

import java.util.HashSet;

public class FindDepth {
    public static int computeDepth(int n) {
        HashSet<Character> set = new HashSet<>();
        int deep = 1;
        while(set.size() != 10) {
            int val = n * deep;
            String k = String.valueOf(val);
            System.out.println(k);
            for(int i = 0; i < k.length() ; i++) {
                set.add(k.charAt(i));
            }
            deep++;
        }
        return deep -1;
    }

    public static void main(String[] args) {
        System.out.println(computeDepth(42));
    }
}
