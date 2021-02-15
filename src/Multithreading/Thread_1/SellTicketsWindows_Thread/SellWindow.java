package Multithreading.Thread_1.SellTicketsWindows_Thread;

public class SellWindow extends Thread {

    private static int ticket = 100;

    @Override
    public void run() {

        while (true) {
            if (ticket > 0) {
                System.out.println(getName() + "：卖票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
