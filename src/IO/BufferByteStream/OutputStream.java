package IO.BufferByteStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        // 1 创建BufferedInputStream
        FileOutputStream fos = new FileOutputStream("H:\\Git\\Java_note\\IO\\3.字节流\\BufferedOutputStream.md");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        // 2 写入文件
        for(int i = 0; i < 10; i ++){
            bos.write("OutputStream\r\n".getBytes());// 写入8k缓冲区
            bos.flush(); // 刷新到硬盘
        }
        // 3 关闭(若中途没有 flush，最后调用 close 时，会自动调用 flush，一次性刷新)
        bos.close();
        System.out.println("finished!");
    }
}
