package Effective_Java.Chapter_2.Item_1.Merit_5.Test;

import Effective_Java.Chapter_2.Item_1.Merit_5.ServiceManger.ServiceManager;
import Effective_Java.Chapter_2.Item_1.Merit_5.Srvice.SubWayInterface;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

//        Class.forName("cn.netjava.cgl.subway.SubwayProviderImpl");
        Class.forName("Effective_Java.Chapter_2.Item_1.Merit_5.ServiceProvider.SubwayProviderImpl");
        SubWayInterface swi = ServiceManager.getService("一卡通");
        swi.in();
        swi.out();
    }
}
