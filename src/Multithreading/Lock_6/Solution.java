package Multithreading.Lock_6;

import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    public static void main(String[] args) {
        Problem2 p = new Problem2();

        new Thread(p).start();
        new Thread(p).start();
        new Thread(p).start();
    }
}

class Problem2 implements Runnable{

    int tickets = 10;

    // 定义 Lock 锁
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try{
                lock.lock();
                if (tickets > 0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " " + tickets--);
                } else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}