package Effective_Java.Chapter_2.Item_1.Merit_5.Srvice;

public class SubWayImpl implements SubWayInterface{
    @Override
    public boolean in() {
        System.out.println("通过一卡通进地铁");
        // ………………………………
        return false;
    }

    @Override
    public boolean out() {
        System.out.println("通过一卡通出地铁");
        // ………………………………
        return false;
    }
}
