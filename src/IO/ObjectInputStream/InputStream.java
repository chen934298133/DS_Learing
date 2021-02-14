package IO.ObjectInputStream;

import IO.Student;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class InputStream {
    public static void main(String[] args) throws Exception {
        // 1. 创建对象流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("H:\\Git\\Java_note\\IO\\3.字节流\\Object.txt"));
        // 2. 读取文件（反序列化）
//        Student s = (Student) ois.readObject();
        // 3. 关闭
        ArrayList list = (ArrayList) ois.readObject();
        ois.close();
        System.out.println(("反序列化执行完毕!"));
        System.out.println((list.toString()));
    }
}