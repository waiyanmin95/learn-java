package JavaSE.Day4;

public class StringEqual {

    public static void main(String[] args) {
        // Check the same memory object
        // In Java, String is immutable. Share the same memory location.
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("Compare two String (s1 == s2) = " + (s1 == s2));

        // Create new memory object
        String s3 = new String("Hello");
        System.out.println("Compare with new (s1 == s3) = " + (s1 == s3));

        // Check the string content
        System.out.println("Compare content s3.equals(s2) = " + s3.equals(s2));
    }
}
