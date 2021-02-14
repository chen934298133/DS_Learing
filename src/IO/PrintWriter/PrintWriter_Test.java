package IO.PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter_Test {
    public static void main(String[] args) throws FileNotFoundException {
        // 1 创建打印流
        PrintWriter pw = new PrintWriter("H:\\Git\\Java_note\\IO\\Test\\PrintWriter.md");
        // 2 打印
        pw.println(12);
        pw.println(true);
        pw.println(3.14);
        pw.println('a');
        // 3 关闭
        pw.close();
        System.out.println("执行完毕！");
    }
}
