package JavaSE.Day4Operators;

public class ShortCircuitLogical {
    static boolean getFalse() {
        System.out.println("GetFalse");
        return false;
    }

    static boolean getTrue() {
        System.out.println("GetTrue");
        return true;
    }

    public static void main(String[] args) {
        // OR
        // if first operand true
        //  return true;
        // else first operand false
        //  return second operand
        // First Operand
        // 0 => return Second Operand
        // 0 0 = 0
        // 0 1 = 1
        // -------
        // First Operand
        // 1 => return First Operand
        // 1 0 = 1
        // 1 1 = 1

        // Short Circuit ( OR ) ||
        // 1 0 = 1
        boolean data = getTrue() || getFalse();
        System.out.println("SHORT CIRCUIT - Logic FIRST OPERAND TRUE = " + data);

        // 0 0 = 0
        data = getFalse() || getFalse();
        System.out.println("SHORT CIRCUIT - Logic FIRST OPERAND FALSE = " + data);
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        // Logical ( OR ) |
        // Check every operand
        data = getTrue() | getFalse();
        System.out.println("LOGICAL - Logic FIRST OPERAND TRUE = " + data);

        data = getFalse() | getFalse();
        System.out.println("LOGICAL - Logic FIRST OPERAND TRUE = " + data);
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");


        // AND
        // 0 0 = 0
        // 0 1 = 0
        // 1 0 = 0
        // 1 1 = 1

        // 0 1 = 0
        data = getFalse() && getTrue();
        System.out.println("SHORT CIRCUIT - Logic FIRST OPERAND False = " + data);

        data = getTrue() && getFalse();
        System.out.println("SHORT CIRCUIT - Logic FIRST OPERAND TRUE = " + data);
    }
}
