package JavaSE.Day15Wrapper;

public class WrapperProblem {
    public static void main(String[] args) {
        Integer i = 127;
        Integer j = 127;
        // Reference Equality
        System.out.println("Reference Equality i == j: "+(i==j));
        System.out.println("----------------------------------");

        // Problem
        // Integer Cache ( range [-128, 127] must be interned )
        i = 128;
        j = 128;
        System.out.println("Reference Equality i == j: "+(i==j));
        System.out.println("----------------------------------");

        // How to check proper
        // Value Equality
        i = 1000;
        j = 1000;
        System.out.println("Value Equality i.intValue() == j.intValue(): "+(i.intValue() == j.intValue()));
        System.out.println("----------------------------------");

        // Reference
        // How to check proper
        // Value Equality
        i = new Integer(1000); // Deprecated
        j = new Integer(1000); // Deprecated
        System.out.println("Reference Equality i == j: "+(i==j));
        System.out.println("New Integer Check: "+(i.intValue() == j.intValue()));
        System.out.println("----------------------------------");

        // Cached
        i = Integer.valueOf(127);
        j = Integer.valueOf("127");
        System.out.println("Reference Equality i (Integer) == j (String): "+(i==j));
        System.out.println("valueOf Check: "+(i.intValue() == j.intValue()));
        System.out.println("I == 127 ? : "+(i.intValue() == 127));
        System.out.println("J == 127 ? : "+(j.intValue() == 127));
        System.out.println("----------------------------------");
    }
}
