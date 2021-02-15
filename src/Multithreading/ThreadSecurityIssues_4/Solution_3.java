package Multithreading.ThreadSecurityIssues_4;

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 *
 *  关于同步方法的总结：
 *  1. 同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 *  2. 非静态的同步方法，同步监视器是：this
 *     静态的同步方法，同步监视器是：当前类本身
 *
 */
public class Solution_3  implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            show();
            if (ticket == 0){
                break;
            }
        }

    }

    private synchronized void show(){//同步监视器：this
        //synchronized (this){
//        if (ticket > 0) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
//        }
        //}
    }
}