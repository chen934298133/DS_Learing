package Multithreading.PCTest;

// 信号灯法
public class PCTest2 {
    public static void main(String[] args){
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}

class Player extends Thread{
    TV tv;
    public Player(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if((i & 1) == 0){
                this.tv.play("节目1");
            }else {
                this.tv.play("节目2");
            }
        }
    }
}

class Watcher extends Thread{
    TV tv;
    public Watcher(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();
        }
    }
}

class TV{
    // 演员表演，观众等待
    // 观众观看，演员等待

    String voice;
    boolean flag = true;
    // 观众

    // 表演
    public synchronized void play(String voice){
        if (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("演员表演了： " + voice );
        // 通知观看
        this.notifyAll();// 通知唤醒
        this.voice = voice;
        this.flag = !this.flag;
    }

    // 观看
    public synchronized void watch(){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观看了： " + voice);
        // 通知演员表演
        this.notifyAll();
        this.flag = !this.flag;
    }
}