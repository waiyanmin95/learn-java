package turing.JavaSE.Day15Enum;

enum Size {
    XLARGE(5), SMALL(1), MEDIUM(2), LARGE(3), XXLARGE(1);
    private final int value;

    Size(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        for (Size s : Size.values()) {
            System.out.println(s + " Value: " + s.getValue() + " Position: " + s.ordinal());
        }

        Size s1 = Size.XXLARGE;
        Size s2 = Size.XLARGE;

        // compareTo [ Equal > zero, High > positive, Low > negative ]
        // Compare with Position ( ordinal )
        int result = s1.compareTo(s2);
        System.out.println("Result: " + result);

        // equals Scenario
        s2 = Size.XXLARGE;
        result = s1.compareTo(s2);
        System.out.println("Result: " + result);
        boolean isEqual = s1.equals(s2);
        System.out.println("isEqual: " + isEqual);

        // == Scenario
        Size s3 = Size.XXLARGE;
        System.out.println("s1 == s2 Scenario: " + (s1 == s1));
        System.out.println("s2 == s3 Scenario: " + (s2 == s3));
        System.out.println("s1 == s3 Scenario: " + (s1 == s3));
    }
}
