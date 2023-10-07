package JavaSE.Day22;

import java.io.File;
import java.util.Arrays;

public class ioDemo {
    public static void main(String[] args) {
        File file = new File("/Users/waiyanmin/java/github.com/learn-java/JavaSE/Day22/");
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.canWrite() = " + file.canWrite());
        System.out.println("file.length() = " + file.length());
        System.out.println("Arrays.toString(file.listFiles()) = " + Arrays.toString(file.listFiles()));
    }
}
