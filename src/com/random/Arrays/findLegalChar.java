package random.Arrays;

public class findLegalChar {
    public static char[] isLegalChar(char[] a, int start, int len) {
        if ( start < 0 || len < 0 || start+len-1 >= a.length ) { // check the error
            return null;
        }
        char[] sub = new char[len];
        for (int i = start, j = 0; j < len; i++, j++) {
                sub[j] = a[i];
        }
        return sub;
    }

    public static void main(String[] args) {
        System.out.println(isLegalChar(new char[]{'a', 'b', 'c'}, 0 , 3)); // {'a', 'b', 'c'}
        System.out.println(isLegalChar(new char[]{'a', 'b', 'c'}, 1, 2)); // {'b', 'c'}
        System.out.println(isLegalChar(new char[]{'a', 'b', 'c'}, 1 , 1)); // {'b'}
        System.out.println(isLegalChar(new char[]{'a', 'b', 'c'}, -2, -2)); // null
    }
}
