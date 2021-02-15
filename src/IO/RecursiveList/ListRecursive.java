package IO.RecursiveList;

import java.io.File;

public class ListRecursive {
    public static void main(String[] args){
//        listDir(new File("H:\\Git\\Java_note"));
        deleteDir(new File("H:\\Git\\Java_note\\IO\\Test\\a"));
    }

    public static void listDir(File dir) {
        File[] files = dir.listFiles();
        System.out.println(dir.getAbsolutePath());
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    listDir(file); // 递归
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
    public static void deleteDir(File dir){
        File[] files = dir.listFiles();
        if(files != null && files.length > 0){
            for(File file : files){
                if(file.isDirectory()){
                    deleteDir(file); // 递归
                }else{
                    // 删除文件
                    System.out.println(file.getAbsolutePath() + " 删除状态： " + file.delete());
                }
            }
        }
    }
}