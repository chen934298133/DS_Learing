package Multithreading.PCTest;

// 管程法
public class PCTest {
    public static void main(String[] args) throws InterruptedException {
        SyContainer container = new SyContainer();

        new Producer(container).start();
        new Consumers(container).start();

        Thread.sleep(1000);
    }
}

class Producer extends Thread {
    SyContainer container;

    public Producer(SyContainer container) {
        this.container = container;
    }

    // produce
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("生产了" + i + "只鸡！");
            try {
                container.push(new Chicken(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumers extends Thread {
    SyContainer container;

    public Consumers(SyContainer container) {
        this.container = container;
    }

    // consume
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("消费第" + container.pop().id + "只鸡！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Chicken {
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}

// 缓冲区
class SyContainer {

    Chicken[] chickens = new Chicken[10];
    int count = 0;

    // 生产者放入产品
//    public synchronized void push(Chicken chicken) throws InterruptedException {
////        Thread.sleep(10);
//        // 若容器满了，就等待消费
//        if (count == chickens.length) {
//            // 通知消费者消费
//            this.wait();
//        }
//
//        if (chickens.length < 9) {
//            // 若容器没有满，就放入产品
//            chickens[count] = chicken;
//            count++;
//            // 通知消费者消费
//        }
//        this.notifyAll();
//
//    }
//
//    // 消费者消费产品
//    public synchronized Chicken pop() throws InterruptedException {
//
////        Thread.sleep(10);
//        // 若容器非空，消费产品
//
//        if (count == 0) {
//            // 通知生成者生产
//            this.wait();
//        }
//
//        // 消费产品
//        count--;
//        Chicken chicken1 = chickens[count];
//        // 通知生产者生产
//
//        this.notifyAll();
//        return chicken1;
//    }
    // 生产者
    public synchronized void push(Chicken chicken) throws InterruptedException {
        Thread.sleep(10);
        // 若容器已经满了，则等待
        while (count == 10) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        chickens[count] = chicken;
        count++;
        this.notifyAll();
    }

    // 消费者
    public synchronized Chicken pop() throws InterruptedException {
        Thread.sleep(10);
        // 若容器为空，则等待生产者生产
        while (count == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        Chicken chicken = chickens[count];
        this.notifyAll();
        return chicken;
    }
}