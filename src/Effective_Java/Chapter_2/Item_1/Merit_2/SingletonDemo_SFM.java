package Effective_Java.Chapter_2.Item_1.Merit_2;

public class SingletonDemo_SFM {

    private SingletonDemo_SFM(){}

    private volatile static SingletonDemo_SFM singletonDemo_sfm;

    public static SingletonDemo_SFM getSingletonDemo_sfm(){
        if (singletonDemo_sfm == null){
            // 由于内存模型，静态工厂方法多线程情况下也会有问题，即使用了双重锁定也一样
            synchronized (SingletonDemo_.class){
                if(singletonDemo_sfm == null){
                    singletonDemo_sfm = new SingletonDemo_SFM();
                }
            }
        }
        return singletonDemo_sfm;
    }
}
