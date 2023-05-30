package JavaSE.Day1;

public class Day1 {
    public static void main(String[] args) {
        byte a = 65;
        char ch = 'A';

        int i = ch;

        ch++;

        System.out.println("Char: " + ch);
        System.out.println("A: " + a);

        boolean flag = true;
        flag = false;

        if (flag) {
            System.out.println("Flag is true");
        } else {
            System.out.println("Flag is false");
        }
        System.out.println("flag = " + flag);

        // Binary

        int b = 11;

        // Hexadecimal
        // Here is the math using the steps above showing you how to convert 0X12 to decimal.
        //
        //2 x 1 = 2
        //1 x 16 = 16
        //
        //2 + 16 = 18
        b = 0x12;
        System.out.println("b = " + b);

        // Binary
        // 2^2 + 2^1 + 2^0 = 4 + 2 + 1 = 7
        b = 0b111;
        System.out.println("b = " + b);

        b = 123_345_666;
        System.out.println("b = " + b);

        // 0.3*10^2
        // Scientific Notation
        double d = .3E3;
        System.out.println("d = " + d);

        d = 9_112_222.1_0_9;
        System.out.println("d Big = " + d);

        float price = 3.8f;
        b = (int) price;
        System.out.println("b = " + b);

        // Type Casting // Small Type < Big Type ( Force ) // Risk Data Loss
        byte b1 = 10;
        byte c1 = 20;

        // ( Operations ) Byte, Short, Int -> Auto Promote to Int and Operate ( Force )
        // Destination < Source
        c1 = (byte) (b1 + 1);
        System.out.println("C1: " + c1);
    }
}
