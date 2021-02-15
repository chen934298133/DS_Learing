package Multithreading.ThreadSecurityIssues_4;

import java.util.concurrent.CopyOnWriteArrayList;

// JUC 安全类型集合
public class JUCTest {
    public static void main(String[] args){
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                list.add(Thread.currentThread().getName());
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
