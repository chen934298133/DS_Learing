package Multithreading.commonMathods_3.StateTest_3_4;

public class StateTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println("---------");
        }) ;

        // 观察启动后
        Thread.State state = thread.getState();
        System.out.println(state);  // NEW

        // 观察启动后
        thread.start();
        state = thread.getState();
        System.out.println(state);  // RUN

        while (state != Thread.State.TERMINATED){  // 只要线程不终止，就一直输出状态
//             Thread.sleep(100);
             state = thread.getState();  // 更新
            System.out.println(state);   // 输出
        }
    }
}
