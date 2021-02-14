package IO.File;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Date;

/**
 * File类的使用
 * 1. 分隔符
 * 2. 文件操作
 * 3. 文件夹操作
 */

public class File_Test {
    public static void main (String[] args) throws Exception{
        // 1. 分隔符
        separator();

        // 2. 文件操作

    }

    // 1. 分隔符
    public static void separator(){
        System.out.println("路径分隔符" + File.pathSeparator);
        System.out.println("名称分隔符" + File.separator);
    }

    // 2. 文件操作
    public static void fileOpen() throws IOException {
        // 1. 创建文件
        File file = new File("H:\\Git\\Java_note\\IO\\Test\\test.md");
        if(!file.exists()){ // 是否存在
//            File file = new File("H:\\Git\\Java_note\\IO\\Test\\test.md");
            boolean b = file.createNewFile();
            System.out.println("文件创建成功：" + b);
        }

        // 2. 删除文件
        // 2.1 直接删除
//        System.out.println("文件删除：" + file.delete());
        // 2.2 使用jvm退出时删除
//        file.deleteOnExit();

        // 3. 获取文件信息
        System.out.println(("获取绝对路径" + file.getAbsolutePath()));
        System.out.println(("获取路径" + file.getPath()));
        System.out.println(("获取文件名称" + file.getName()));
        System.out.println(("获取文件目录" + file.getParent()));
        System.out.println(("获取文件长度" + file.length()));
        System.out.println(("文件创建时间" + new Date(file.lastModified()).toLocaleString()));

        // 4. 判断
        System.out.println(("是否可写" + file.canWrite()));
        System.out.println(("是否是文件" + file.isFile()));
        System.out.println(("是否隐藏" + file.isHidden()));
    }


    // 3.文件夹操作
    public static void directoryOpe() throws Exception{
        // 1. 创建文件夹
        File dir = new File("H:\\Git\\Java_note\\IO\\Test\\a\\b\\c");
        System.out.println((dir.toString()));
        if(!dir.exists()){
            //dir.mkdir(); // 只能创建单级目录
            dir.mkdirs(); // 创建多级目录
        }

        // 2. 删除文件夹
        // 2.1 直接删除
        System.out.println("删除结果：" + dir.delete());
        // 2.2 使用jvm删除
//        dir.deleteOnExit();

        // 3. 获取文件夹信息
        System.out.println(("获取绝对路径" + dir.getAbsolutePath()));
        System.out.println(("获取路径" + dir.getPath()));
        System.out.println(("获取文件名称" + dir.getName()));
        System.out.println(("获取夫目录" + dir.getParent()));
        System.out.println(("获取文件长度" + dir.length()));
        System.out.println(("文件夹创建时间" + new Date(dir.lastModified()).toLocaleString()));

        // 4. 判断
        System.out.println(("是否是文件夹" + dir.isFile()));
        System.out.println(("是否隐藏" + dir.isHidden()));

        // 5. 遍历文件夹
        File dir2 = new File("...");
        String[] files = dir2.list();
        for(String string : files){
            System.out.println((string));
        }

        // FileFilter接口的使用

        File[] files2 = dir2.listFiles(new FileFilter(){

            @Override
            public boolean accept(File pathname){
                if(pathname.getName().endsWith(".jpg")){
                    return true;
                }
                return false;
            }
        });
        for(File file : files2){
            System.out.println((file.getName()));
        }

    }
}
