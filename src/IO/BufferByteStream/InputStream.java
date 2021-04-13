package IO.BufferByteStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        // 1 创建BufferedInputStream
        FileInputStream fis = new FileInputStream("H:\\Git\\Java_note\\IO\\Test\\BufferByteStream.md");
        BufferedInputStream bis = new BufferedInputStream(fis);
        // 2 读取
        int data = 0;
        // 此方法使用 BufferedInputStream 内部自带缓存区，大小为 DEFAULT_BUFFER_SIZE = 8192
        while((data = bis.read()) != -1){
            System.out.print(((char) data));
        }

        // 用自己创建的缓冲流
        byte[] buf = new byte[1024];
        int count = 0;
        while((count = bis.read(buf)) != -1){
            System.out.print((new String(buf, 0, count)));
        }

        // 3 关闭
        bis.close();
    }
}
