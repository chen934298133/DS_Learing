package Multithreading.ThreadSecurityIssues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class unsafeList {
    public static void main(String[] args) throws InterruptedException {
        List<String> list= new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }

        Thread.sleep(1000);
        System.out.println(list.size());
    }
}