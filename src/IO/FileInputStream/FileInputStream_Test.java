package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("H:\\Git\\Java_note\\IO\\3.字节流\\test.md");
        int data = 0;
        while ((data = fis.read()) != -1){
            // 一个字节一个字节读，但是一个汉字是3个字节，无法正常读取。
            System.out.print((char) data);
        }
    }
}
