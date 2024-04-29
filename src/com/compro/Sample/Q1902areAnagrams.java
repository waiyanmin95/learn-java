package compro.Sample;

public class Q1902areAnagrams {
    public static int areAnagrams(char[] a, char[] b) {
        if (a.length != b.length) {
            return 0;
        }
        int count = 0;
        int preCount = 0;
        for (int i = 0; i < a.length; i++) {
            preCount = count;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                }
            }
            if (preCount != count - 1) {
                return 0;
            }
        }

        return count == a.length ? 1 : 0;
    }

    public static void main(String[] args) {
//        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'t', 'i', 's'}));
//        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
//        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
//        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
//        System.out.println(areAnagrams(new char[]{}, new char[]{}));
//        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
        System.out.println(areAnagrams(new char[]{'p', 'o', 'o', 'l'}, new char[]{'p', 'o', 'l', 'l'}));
    }
}
