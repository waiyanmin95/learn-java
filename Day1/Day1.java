package Day1;

import java.util.Arrays;

public class Day1 {

    // Define the constant value PI
    public final double PI = 3.14;
    public final String GF = "Jerry";
    public String fullName = "Tom";

    // sayHello will print out the "Hello"
    public void sayHello() {
        System.out.println("Hello");
    }

    private char getInitial() {
        return fullName.charAt(0);
    }

    // saySomething method will print out the input text
    // void = no return value
    public void saySomething(String text) {
        System.out.println(text);
    }

    // getSum method will return the sum of two integers
    // No print out need to print from the main
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }


    public void getArray(String[] data) {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        // Initialize the Day1 class
        Day1 d = new Day1();
        d.sayHello();
        char middleInitial = d.getInitial();
        System.out.println(middleInitial);
        d.saySomething("This is JAVA class");
        System.out.println(d.getSum(1, 2));
        System.out.printf("PI value: %s\tGirlfriend name: %s\n", d.PI, d.GF);
        String[] words = new String[]{"one", "two", "three"};
        d.getArray(words);
    }
}
