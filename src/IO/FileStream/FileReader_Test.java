package IO.FileStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_Test {
    public static void main(String[] args) throws IOException {
        // 1. 创建FileReader 文件字符输入流
        FileReader fr = new FileReader("H:\\Git\\Java_note\\IO\\Test\\test.md");
        // 2. 读取
        // 2.1
        // 方法一：单个字符读取
        int data = 0;
        while((data = fr.read()) != -1){
            System.out.print((char) data);
        }

        // 方法二：字符缓冲区读取
        char[] buf = new char[2];
        int count = 0;
        while((count = fr.read(buf)) != -1){
            System.out.println(new String(buf, 0, count));
        }

        // 3. 关闭
        fr.close();
    }
}
