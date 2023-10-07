package JavaSE.Day16ioStreams;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = scan.nextLine();
        System.out.println("Your name is "+ name);
    }
}
