package IO.FileStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Test {
    public static void main(String[] args) throws IOException {
        // 1. 创建FileWriter对象
        FileWriter fw = new FileWriter("H:\\Git\\Java_note\\IO\\Test\\test.md");
        // 2. 写入
        for(int i = 0; i < 10; i ++){
            fw.write("写入的内容: FileWriter_Test\r\n");
            fw.flush();
        }
        // 3. 关闭
        fw.close();
        System.out.println(("执行完毕!"));
    }
}
