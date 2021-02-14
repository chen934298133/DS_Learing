package IO.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ImageCopy {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("H:\\Git\\Java_note\\IO\\3.字节流\\1-200306224U3.jpg");
        FileOutputStream out = new FileOutputStream("H:\\Git\\Java_note\\IO\\3.字节流\\test.jpg");
        // 一边读一边写
         byte[] buf = new byte[1024];
         int count = 0;
         while ((count = in.read(buf)) != -1){
             out.write(buf, 0, count);
         }
         in.close();
         out.close();
        System.out.println("closed!");

    }
}
