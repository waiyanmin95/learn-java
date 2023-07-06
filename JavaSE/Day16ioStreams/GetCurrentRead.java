package JavaSE.Day16ioStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class GetCurrentRead {
    public static void main(String[] args) {
        String currentPath;
        {
            try {
                currentPath = new java.io.File(".").getCanonicalPath();
                System.out.println(currentPath);
                // Try-with-resource > Don't need to close
                try (FileInputStream fin = new FileInputStream(currentPath+"/JavaSE/Day16ioStreams/Hello.txt")) {
                    int data;
                    do {
                        data = fin.read(); // the total number of bytes read into the buffer
                        if ( data != -1 ) {
                            System.out.print((char) data);
                        }
                    }while (data != -1); // -1 if there is no more data because the end of the stream has been reached.

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
