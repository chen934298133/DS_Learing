package Multithreading.Test;

import Multithreading.ThreadSecurityIssues_4.Solution_2;

public class Solution_2_Test {
    public static void main(String[] args) {
        Solution_2 t1 = new Solution_2();
        Solution_2 t2 = new Solution_2();
        Solution_2 t3 = new Solution_2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
