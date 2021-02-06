package Multithreading.ThreadSecurityIssues;

/**
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 * <p>
 * 例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 * <p>
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器。
 */
public class Solution_2 extends Thread {

    private static int ticket = 100;

    //        private static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            show();
            if (ticket == 0){
                break;
            }
        }
    }

    private void show() {
        // 正确的
        // synchronized (obj){
        synchronized (Solution_2.class) {//Class clazz = Window2.class , Window2.class只会加载一次
        // 错误的方式：this代表着实例化的t1,t2,t3三个对象，即把互斥信号又同时交给每个对象，问题等于没解决
        // synchronized (this){
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "：卖票，票号为：" + ticket);
                ticket--;
            }
        }
    }
}

