package JavaSE.Day11Exceptions;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("/Users/waiyanmin/java/github.com/learn-java/README.md");
        System.out.println("IsFile ? = " + f.isFile());
        System.out.println("IsExist ? = " + f.exists());
        System.out.println("GetName = " + f.getName() + " GetPATH = " + f.getPath());
    }
}
