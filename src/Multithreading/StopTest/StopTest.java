package Multithreading.StopTest;

public class StopTest implements Runnable{

    private boolean sign = true;
    @Override
    public void run() {
        int i = 0;
        while (sign){
            System.out.println(Thread.currentThread().getName() +" i = " + i++);
        }
    }

    public void stop(){
        this.sign = false;
    }



    public static void main(String[] args) throws InterruptedException {

        StopTest stopTest = new StopTest();
        new Thread(stopTest).start();


        for (int i = 0; i < 100; i++) {
            Thread.sleep(1);
            System.out.println(Thread.currentThread().getName() + i);
            if (i == 90 ){
                stopTest.stop();
                System.out.println("stop!!!!!!!!!!!!!");
            }
        }
    }
}
