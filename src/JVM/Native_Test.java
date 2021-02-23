package JVM;

public class Native_Test {
    public static void main(String[] args){
        new Thread(() -> {},"Thread1").start();
    }

    /**
     *     start() 源码
     *
     *     public synchronized void start() {
     *
     *         if (threadStatus != 0)
     *             throw new IllegalThreadStateException();
     *
     *         group.add(this);
     *
     *         boolean started = false;
     *         try {
     *             start0(); // 调用了start0()方法
     *             started = true;
     *         } finally {
     *             try {
     *                 if (!started) {
     *                     group.threadStartFailed(this);
     *                 }
     *             } catch (Throwable ignore) {
     *
     *             }
     *         }
     *     }
     */

    // Java在内存区域中专门开辟了一块标记区域——本地方法栈，用来登记native方法，凡是带了native关键字的，会进入到本地方法栈中，调用本地方法接口（JNI），在最终执行的时候，加载本地方法库中的方法通过JNI
    // 凡是带了native关键字的，就说明Java的作用范围达不到了，会去调用底层C语言的库
    private native void start0(); //start0()方法的定义，这个方法会调用底层C
}
