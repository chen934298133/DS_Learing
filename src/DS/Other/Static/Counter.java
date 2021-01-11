package DS.Other.Static;

import sun.applet.Main;

public class Counter {
    static int count = 0;
    int temp = 100;

    Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
//        System.out.println(count);
        System.out.println(Counter.count);
        System.out.println(c1.count);
        System.out.println(c1.temp);

    }
    static{
        System.out.println("我是静态块！");
    }
}
