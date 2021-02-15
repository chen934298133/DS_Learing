package Multithreading.Test;

import Multithreading.ThreadSecurityIssues_4.Solution_3;

public class Solution_3_Test {
    public static void main(String[] args) {
        Solution_3 w = new Solution_3();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
