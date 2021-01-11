package Effective_Java.Chapter_2.Item_1.Merit_6;

public class Test {
    public static void main(String[] args){

        //实例化需要制定泛型
        MyMap<String,String> map1 = new MyMap<>(); // 后者尖括号在Java7 中已改进

        // 静态工厂
        MyMap<String, String> map2 = MyMap.getInstance();
    }
}
