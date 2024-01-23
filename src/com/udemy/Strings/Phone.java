package Strings;

public class Phone {
    public static void main(String[] args) {
        String phoneNumber = "(234) 333-5671";

        String areaCode = phoneNumber.substring(1,4);
        String exchange = phoneNumber.substring(6,9);
        String lineNumber = phoneNumber.substring(10);

        System.out.println("AreaCode: "+areaCode);
        System.out.println("Exchange: "+exchange);
        System.out.println("LineNumber: "+lineNumber);
    }
}
