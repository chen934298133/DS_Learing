package Multithreading.commonMathods_3.JoinTest_3_3;

public class JoinTest implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("VIP is coming!!! " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinTest joinTest = new JoinTest();
        Thread t = new Thread(joinTest,"a");
        t.start();

        for (int i = 0; i < 500; i++) {
            if (i == 400){
                t.join();
            }
            System.out.println(Thread.currentThread().getName() + " running to " + i);
        }
    }
}
