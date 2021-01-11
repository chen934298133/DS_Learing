package Effective_Java.Chapter_2.Item_1.Merit_6;

public class MyMap <K,V> {

    public MyMap(){}

    public static <K,V> MyMap<K,V> getInstance(){
        return new MyMap<K,V>();
    }

}
