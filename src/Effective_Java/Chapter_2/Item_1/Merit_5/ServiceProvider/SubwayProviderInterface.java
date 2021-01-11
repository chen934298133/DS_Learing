package Effective_Java.Chapter_2.Item_1.Merit_5.ServiceProvider;

import Effective_Java.Chapter_2.Item_1.Merit_5.Srvice.SubWayInterface;

//四大组成之二：服务提供者接口
public interface SubwayProviderInterface {

    //登录服务的提供者。通俗点说就是：通过这个getService()可以获得一个服务。
    public SubWayInterface getService() ;
}
