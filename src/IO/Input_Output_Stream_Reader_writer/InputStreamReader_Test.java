package IO.Input_Output_Stream_Reader_writer;

import java.io.*;
/**
 * 字节流到字符流的桥
 */
public class InputStreamReader_Test {
    public static void main(String[] args) throws IOException {
        // 1 创建InputStreamReader对象
        FileInputStream fis = new FileInputStream("H:\\Git\\Java_note\\IO\\Test\\test.md");
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        // 2 读取文件
        int data = 0;
        while((data = isr.read()) != -1){
            System.out.print((char) data);
        }
        // 3 关闭
        isr.close();
    }
}
