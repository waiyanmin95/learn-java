package JavaSE.Day24;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIs {
    public static void main(String[] args) throws IOException {
        try {
            int c;
            Socket s = new Socket("www.google.com", 443);

            // Get Input and OutPut Stream
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            String str = "hello";
            byte[] bs = str.getBytes();

            // Send Request
            out.write(bs);

            // Read and Display response
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}