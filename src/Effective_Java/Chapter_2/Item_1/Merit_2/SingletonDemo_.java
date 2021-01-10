package Effective_Java.Chapter_2.Item_1.Merit_2;

public class SingletonDemo_ {
    //懒汉单例模式

    //构造函数私有化
    private SingletonDemo_(){}

    //维护一个单例对象
    private static SingletonDemo_ singletonDemo_;

    public static SingletonDemo_ getSingletonDemo_(){
        if (singletonDemo_ == null){
            singletonDemo_ = new SingletonDemo_();
        }
        return singletonDemo_;
    }
}
