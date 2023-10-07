package JavaSE.Day16ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {
    public static void main(String[] args) {
        File f = new File("/Users/waiyanmin/java/github.com/learn-java/README.md");
        System.out.println("Absolute path: "+f.getAbsoluteFile());
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(f);
            int data;
            try{
                do {
                    data = fin.read(); // the total number of bytes read into the buffer
                    if ( data != -1 ) {
                        System.out.print((char)data);
                    }
                }while (data != -1); // -1 if there is no more data because the end of the stream has been reached.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                assert fin != null;
                fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
