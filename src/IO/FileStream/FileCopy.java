package IO.FileStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 不能复制图片或者二进制文件（因为不是字符编码文件，使用字符读取即读取的都是乱码）
 * 需使用字节流
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        // 1. 创建
        FileReader fr = new FileReader("H:\\Git\\Java_note\\IO\\Test\\test.md");
        FileWriter fw = new FileWriter("H:\\Git\\Java_note\\IO\\Test\\FileCopy.md");
        // 2. 读写
        int data = 0;
        while ((data = fr.read()) != -1){
            fw.write(data);
            fw.flush();
        }
        // 3. 关闭
        fw.close();
        fr.close();
        System.out.println("执行完毕！");
    }
}
