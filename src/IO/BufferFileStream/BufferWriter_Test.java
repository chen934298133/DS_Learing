package IO.BufferFileStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter_Test {
    public static void main(String[] args) throws IOException {
        // 1. 创建BufferedWriter对象
        FileWriter fw = new FileWriter("H:\\Git\\Java_note\\IO\\Test\\BufferWriter.md");
        BufferedWriter bw = new BufferedWriter(fw);
        // 2. 写入
        for(int i = 0; i < 10; i ++){
            bw.write(i + ". 写入的内容: BufferWriter");
            bw.newLine(); // 写入一个换行符 windows \r\n linux \n
            bw.flush();
        }
        // 3. 关闭
        bw.close(); // 此时会自动关闭fw
        System.out.println("执行完毕！");
    }
}
