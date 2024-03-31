package turing.JavaSE.Day7Class;

public class DefaultValues {

    boolean flag;
    int num;
    double dec;
    String msg;

    public static void main(String[] args) {
        DefaultValues values = new DefaultValues();

        System.out.println("Number = " + values.num);
        System.out.println("Message = " + values.msg);
        System.out.println("Flag = " + values.flag);
        System.out.println("Double = " + values.dec);
    }
}
