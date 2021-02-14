package IO.ByteStream;

import java.io.FileInputStream;

/**
 * FileInputStream
 * 文件字节输入流
 */
public class InputStream {
    public static void main(String[] args) throws Exception {
        // 1. 创建FileInputStream，并指定问价路径
        FileInputStream in = new FileInputStream("H:\\Git\\Java_note\\IO\\3.字节流\\FileInputStream.md");
        // 2. 读取文件

// 单字节读取（为什么用 char data 不行？）
//        int data;
//        while((data = in.read()) != -1){
//            System.out.println((char) data);
//        }

// 多字节读取
//        byte[] buf = new byte[3];
//        int count = in.read(buf);
//        System.out.println(new String(buf));
//        System.out.println(count);

// 优化
        byte[] buf = new byte[3];
        int count = 0;
        while ((count = in.read(buf)) != -1){
            System.out.println(new String(buf, 0 ,count));
        }


        // 3. 关闭
        in.close();
        System.out.println("执行结束！");
    }
}
