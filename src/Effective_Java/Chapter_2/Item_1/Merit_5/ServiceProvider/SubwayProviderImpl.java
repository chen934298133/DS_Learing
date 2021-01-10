package Effective_Java.Chapter_2.Item_1.Merit_5.ServiceProvider;

import Effective_Java.Chapter_2.Item_1.Merit_5.ServiceManger.ServiceManager;
import Effective_Java.Chapter_2.Item_1.Merit_5.Srvice.SubWayImpl;
import Effective_Java.Chapter_2.Item_1.Merit_5.Srvice.SubWayInterface;

public class SubwayProviderImpl implements SubwayProviderInterface{
    static {
        ServiceManager.registerProvider("一卡通", new SubwayProviderImpl());
    }

    @Override
    public SubWayInterface getService() {
        return new SubWayImpl();
    }
}
