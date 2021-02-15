package IO;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * Properties可以保存到流中或从流中加载。
 */
public class properties_Test {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //
        properties.setProperty("z1","21");
        properties.setProperty("z2","22");
        properties.setProperty("z3","23");
        System.out.println(properties.toString());

        // 遍历
        // 1. keySet
        // 2. entrySet
        // 3. stringPropertyNames
        Set<String> set = properties.stringPropertyNames();
        for (String str : set){
            System.out.println(str + " == " + properties.getProperty(str));
        }

        // 和流有关的方法 写出
        PrintWriter pw = new PrintWriter("H:\\Git\\Java_note\\IO\\Test\\properties.md");
        properties.list(pw);    // 将properties的内容写到 pw 中
        pw.close();     // 自带flush

        // store 方法 保存写出
        FileOutputStream fos = new FileOutputStream("H:\\Git\\Java_note\\IO\\Test\\properties.properties");
        properties.store(fos,"test");
        fos.close();    // 自带flush

        // load 方法 加载写入
        Properties properties1 = new Properties();
        FileInputStream fis = new FileInputStream("H:\\Git\\Java_note\\IO\\Test\\properties.properties");
        properties1.load(fis);
        fis.close();
        System.out.println(properties1.toString());
    }
}
