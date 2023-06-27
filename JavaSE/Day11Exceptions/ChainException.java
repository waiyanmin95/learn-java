package JavaSE.Day11Exceptions;

public class ChainException {
    static void Demoproc() {
        NullPointerException ne = new NullPointerException("Top Layer");
        ne.initCause(new ArithmeticException("Cause"));
        throw ne;
    }

    public static void main(String[] args) {
        try {
            Demoproc();
        } catch (NullPointerException ne) {
            ne.printStackTrace();
            System.out.println("NE = " + ne.getCause().getMessage());
        }
    }
}
