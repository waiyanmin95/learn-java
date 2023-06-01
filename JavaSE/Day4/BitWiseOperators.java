package JavaSE.Day4;

// BitWise => Number Type
public class BitWiseOperators {
    public static void main(String[] args) {
        int a = 2; // 1 0
        int b = 3; // 1 1
        // 2^3 + 0 + 2^1 + 0 
        System.out.println("A in binary = " + Integer.toBinaryString(a));
        System.out.println("B in binary = " + Integer.toBinaryString(b));

        // AND          // OR       // XOR       // NOT
        // 0 0 = 0      0 0 = 0     0 0 = 0      !0 = 1
        // 0 1 = 0      0 1 = 1     0 1 = 1      !1 = 0
        // 1 0 = 0      1 0 = 1     1 0 = 1
        // 1 1 = 1      1 1 = 1     1 1 = 0
        int modifier = 5;
        int PublicFlag = 1;
        int StaticFlag = 4;
        System.out.println("Integer.toBinaryString(modifier) = " + Integer.toBinaryString(modifier));

        boolean isPublic = (modifier & PublicFlag) == PublicFlag;
        System.out.println("isPublic = " + isPublic);

        boolean isStatic = (modifier & StaticFlag) == StaticFlag;
        System.out.println("isStatic = " + isStatic);

        System.out.println("Integer.toBinaryString(a & b) AND = " + Integer.toBinaryString(a & b));
        System.out.println("Integer.toBinaryString(a | b) OR = " + Integer.toBinaryString(a | b));
        System.out.println("Integer.toBinaryString(a ^ b) XOR = " + Integer.toBinaryString(a ^ b));
        System.out.println("Integer.toBinaryString(~ b ) NOT = " + Integer.toBinaryString(~b));


        // Bit Shifting
        // Left shift act as multiply by 2 power X size ( 2^X )
        System.out.println("Left Shift = " + (a << 5));

        // Right shift act as division by 2 power X size ( 2^X )
        System.out.println("Right Shift = " + (b >> 1));
    }
}
