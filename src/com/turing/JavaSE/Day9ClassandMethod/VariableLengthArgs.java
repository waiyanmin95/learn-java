package turing.JavaSE.Day9ClassandMethod;

public class VariableLengthArgs {
    // Static Method no need to construct
    // int... variadic
    // String... variadic
    static int isum(int... data) {
        int result = 0;
        for (int i : data) {
            result += i;
        }
        return result;
    }

    static String ssum(String... data) {
        String result = "";
        for (String i : data) {
            result += i;
        }
        return result;
    }

    static int mixsum(String msg, int... data) {
        int result = 0;
        for (int i : data) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        int iresult = isum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("The Int Result = " + iresult);

        String sresult = ssum("Hello ", "Java ", "Learning ");
        System.out.println("The String Result = " + sresult);

        int mresult = mixsum("Sum all digit", 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("The Mixed Result = " + mresult);

        mresult = mixsum("Sum all digit");
        System.out.println("The Mixed Result with empty data = " + mresult);
    }
}
