package Multithreading.Test;

import Multithreading.Thread.SellTicketsWindows_Thread.SellWindow;

public class SellWindowTest {
    public static void main(String[] args){
        SellWindow s1 = new SellWindow();
        SellWindow s2 = new SellWindow();
        SellWindow s3 = new SellWindow();

        s1.setName("window1: ");
        s2.setName("window2: ");
        s3.setName("window3: ");

        s1.start();
        s2.start();
        s3.start();
    }
}
