package Multithreading.PriorityTest;

public class PriorityTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args){
        PriorityTest priorityTest = new PriorityTest();

        Thread t1 = new Thread(priorityTest,"a");
        Thread t2 = new Thread(priorityTest,"b");
        Thread t3 = new Thread(priorityTest,"c");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(9);

        t3.start();
        t2.start();
        t1.start();

    }
}

