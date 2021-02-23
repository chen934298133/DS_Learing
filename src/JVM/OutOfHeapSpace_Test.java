package JVM;

import java.util.Random;

public class OutOfHeapSpace_Test {
    public static void main(String[] args){
        String s = "OutOfHeapSpace_Test";
        while (true){
            s += s + new Random().nextInt(888888) + "_" + new Random().nextInt(999999);
            System.out.println(s);
        }
    }
}
