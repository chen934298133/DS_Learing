package Multithreading.ThreadPoll_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolTest {
    public static void main(String[] args){
        // 1 创建服务，创建线程池
        // newFixedThreadPool 参数即为线程池大小
        ExecutorService service = Executors.newFixedThreadPool(10);

        // 执行
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        // 关闭连接
        service.shutdown();
    }
}


class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() +" " + i);
        }
    }
}