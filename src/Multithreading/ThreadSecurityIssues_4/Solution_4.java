package Multithreading.ThreadSecurityIssues_4;

/**
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 *
 * @author shkstart
 * @create 2019-02-15 上午 11:43
 */
public class Solution_4 extends Thread {
    private static int ticket = 100;
    @Override
    public void run() {
        while (true) {
            show();
            if (ticket == 0){
                break;
            }
        }
    }
    private static synchronized void show(){//同步监视器：Window4.class
        //private synchronized void show(){ //同步监视器：t1,t2,t3。此种解决方式是错误的
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
            ticket--;
        }
    }
}