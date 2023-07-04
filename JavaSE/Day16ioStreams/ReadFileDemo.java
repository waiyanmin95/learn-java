package JavaSE.Day16ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {
    public static void main(String[] args) {
        File f = new File("/Users/waiyanmin/java/github.com/learn-java/README.md");
        System.out.println("Absolute path: "+f.getAbsoluteFile());
        try (FileInputStream fin = new FileInputStream(f)) {
            int data;
            do {
                data = fin.read(); // the total number of bytes read into the buffer
                if ( data != -1 ) {
                    System.out.print((char)data);
                }
            }while (data != -1); // -1 if there is no more data because the end of the stream has been reached.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
