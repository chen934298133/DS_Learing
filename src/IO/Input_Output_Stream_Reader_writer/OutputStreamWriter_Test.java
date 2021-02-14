package IO.Input_Output_Stream_Reader_writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流到字节流的桥
 */
public class OutputStreamWriter_Test {
    public static void main(String[] args) throws IOException {
        // 1 创建OutputStreamReader对象
        FileOutputStream fos = new FileOutputStream("H:\\Git\\Java_note\\IO\\Test\\test.md");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        // 2 写入
        for(int i = 0; i < 10; i ++){
            osw.write("写入内容");
            osw.flush();
        }
        // 3 关闭
        osw.close();
    }
}
