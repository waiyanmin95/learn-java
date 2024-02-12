package turing.JavaSE.Day11Exceptions;

public class BuildInException {
    public static void main(String[] args) {
        String name = null;
        int[] xi = new int[]{1, 2, 3, 4, 5};
        try {
            // xi[10] = 10;
            System.out.println("Uppercase: " + name.toUpperCase());
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException ee) {
            System.out.println(ee.getMessage());
        }
        // Multiple form with individual catch blocks
        /*
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
        }
        catch (NullPointerException ne) {
            System.out.println(ne.getMessage());
        }
         */
        System.out.println("This is another line");
    }
}
