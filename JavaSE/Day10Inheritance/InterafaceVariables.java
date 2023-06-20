package JavaSE.Day10Inheritance;

interface JobLevel {
    // Defined variables in interface implicitly become FINAL ( Constant )
    int MANAGER = 5;
    int ENGINEER = 2;
}

public class InterafaceVariables {
    public static void main(String[] args) {
        int level = JobLevel.ENGINEER;
        // Cannot assign a value to final variable 'ENGINEER'
        // JobLevel.ENGINEER = 3;
    }
}
