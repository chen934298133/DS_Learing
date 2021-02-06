package Multithreading.Test;

import Multithreading.ThreadSecurityIssues.Solution_4;

public class Solution_4_Test {
    public static void main(String[] args){

        Solution_4 t1 = new Solution_4();
        Solution_4 t2 = new Solution_4();
        Solution_4 t3 = new Solution_4();

        t1.setName("window1: ");
        t2.setName("window2: ");
        t3.setName("window3: ");

        t1.start();
        t2.start();
        t3.start();
    }
}
