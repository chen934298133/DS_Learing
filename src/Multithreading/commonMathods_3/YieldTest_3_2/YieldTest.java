package Multithreading.commonMathods_3.YieldTest_3_2;

public class YieldTest {
    public static void main(String[] args){
          MyYield myYield = new MyYield();

          new Thread(myYield, "a").start();
          new Thread(myYield, "b").start();
    }
}

class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start running");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " stop running");
    }
}
