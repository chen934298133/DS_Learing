package Multithreading.DeadLock_5;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        Thread girl1 = new Makeup(0, "mary");
        Makeup girl2 = new Makeup(1, "ketty");

        girl1.start();
//        girl2.start();
        girl2.makeup();
        System.out.println("化妆完成！");
    }

}

class Lipstick{

}

class Mirror{

}

class Makeup extends Thread{
    // 需要的资源只有一份，用static修饰
    static Lipstick lipstick = new Lipstick();
    static Mirror1 mirror = new Mirror1();

    int choice;
    String girlName;

    public Makeup(int choice, String girlName){
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        // 化妆
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void makeup() throws InterruptedException {
        if (choice == 0){
            synchronized (lipstick){
                System.out.println(this.girlName + " 获得lipstick");  // 获得后，待代码块运行结束自动释放
                Thread.sleep(1000);

                synchronized (mirror){
                    System.out.println(this.girlName + " 获得mirror"); // 由于else的代码块没有运行结束，mirror的资源一直在另一个对象手中
                }
            }
        }else {
            synchronized (mirror){
                System.out.println(this.girlName + " 获得mirror");
                Thread.sleep(1000);

                synchronized (lipstick){
                    System.out.println(this.girlName + " 获得lipstick");
                }
            }
        }
    }
}