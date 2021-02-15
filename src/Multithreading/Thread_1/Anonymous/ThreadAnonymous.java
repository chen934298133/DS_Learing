package Multithreading.Thread_1.Anonymous;

public class ThreadAnonymous {
    public static void main(String[] args){
        // 由于线程特殊性，若只是用一次，使用匿名方法
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if ((i & 1) == 1){
                        System.out.println(Thread.currentThread().getName() + " : " + i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if ((i & 1) == 1){
                        System.out.println(Thread.currentThread().getName() + " : " + i);
                    }
                }
            }
        }.start();
    }
}
