package IO.BufferFileStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader_Test {
    public static void main(String[] args) throws IOException {
        // 创建缓冲流
        FileReader fr = new FileReader("H:\\Git\\Java_note\\IO\\Test\\test.md");
        BufferedReader br = new BufferedReader(fr);
        // 读取
        // 1. 第一种方式 将字符读入数组
        char[] buf = new char[1024];
        int count = 0;
        while((count = br.read(buf)) != -1){
//      br.read(buf, 0, buf.length) 只放数组，默认 0-length
            System.out.println(new String(buf, 0, count));
        }
        // 2. 第二种方式 一行一行读取
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        // 3. 第三种方式 逐个字符读取
        int temp = 0;
        while ((temp = br.read()) != -1){
            System.out.print((char) temp);
        }

        // 关闭
        br.close();
    }
}
