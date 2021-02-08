package Multithreading.Lock;

public class LockTest {
    public static void main(String[] args){
        Problem p = new Problem();

        new Thread(p).start();
        new Thread(p).start();
        new Thread(p).start();
    }
}

class Problem implements Runnable{

    int tickets = 10;

    @Override
    public void run() {
        while (true){
            if (tickets > 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " " + tickets--);
            } else {
                break;
            }
        }
    }
}
