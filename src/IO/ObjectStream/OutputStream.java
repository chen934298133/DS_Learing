package IO.ObjectStream;

import IO.Student;
import java.io.*;
import java.util.ArrayList;

/**
 * 实现序列化
 */
public class OutputStream {
    public static void main(String[] args) throws IOException {
        // 1. 创建对象流
        FileOutputStream fos = new 	FileOutputStream("H:\\Git\\Java_note\\IO\\3.字节流\\Object.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // 2. 序列化（写出操作）
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zs", 20);
        Student s2 = new Student("ls", 24);
        list.add(s1);
        list.add(s2);
        oos.writeObject(list);
        // 3. 关闭
        oos.close();
        System.out.println(("序列化完毕!"));
        System.out.println(list.toString());
    }
}
