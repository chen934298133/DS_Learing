package Multithreading.Test;

import Multithreading.Runnable.MyRunnable;

public class MyRunnableTest {

    public static void main(String[] args) {
        //3. 创建实现类的对象
        MyRunnable mThread = new MyRunnable();

        //4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mThread);

        t1.setName("线程1: ");

        //5. 通过Thread类的对象调用start():① 启动线程 ②调用当前线程的run()-->调用了Runnable类型的target的run()
        t1.start();

        //再启动一个线程，遍历100以内的偶数
        Thread t2 = new Thread(mThread);
        t2.setName("线程2: ");
        t2.start();
    }
}
