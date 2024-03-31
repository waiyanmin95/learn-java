package turing.JavaSE.Day22;

import java.util.Date;
import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date = " + date);
        System.out.println("Date Time = " + date.getTime());

        Formatter f = new Formatter();
        String data = f.format("Formatting %s is easy %d %.3f", "with Java", 10, 98.68888).toString();
        System.out.println("Data = " + data);
    }
}
