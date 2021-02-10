package IO;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStream {
    public static void main(String[] args) throws Exception {
        // 1. 创建问价字节输出流对象
        FileOutputStream out = new FileOutputStream("H:\\Git\\Java_note\\IO\\3.字节流\\test.md");
        // 2. 写入文件
        out.write(97);
        out.write('c');
        out.write('h');
        out.write('e');
        out.write('n');

        String string = "hello!";
        out.write(string.getBytes());
        // 3. 关闭
        out.close();
        System.out.println("执行关闭！");
    }
}
