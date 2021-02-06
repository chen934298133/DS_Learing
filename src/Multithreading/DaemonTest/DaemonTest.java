package Multithreading.DaemonTest;

public class DaemonTest {

    public static void main(String[] args){

        God god = new God();
        You you = new You();
        Thread thread = new Thread(god);
        thread.setDaemon(true); // 默认为false,表示用户线程
        thread.start();

        new Thread(you).start();
    }
}

class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("God bless you!");
        }
    }
}


class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("I am so happy!");
        }
        System.out.println("----goodbye world!----");
    }
}