package Effective_Java.Chapter_2.Item_1.Merit_5.ServiceManger;

import Effective_Java.Chapter_2.Item_1.Merit_5.ServiceProvider.SubwayProviderInterface;
import Effective_Java.Chapter_2.Item_1.Merit_5.Srvice.SubWayInterface;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
* 这是一个服务管理器，里面包含了四大组成中的三和四
* 解释：通过注册将 服务提供者 加入map，然后通过一个静态工厂方法 getService(String name) 返回不同的服务。
*/
public class ServiceManager {

    private ServiceManager(){}

    private static final Map<String, SubwayProviderInterface> providers = new ConcurrentHashMap<>();

    //四大组成之三：提供者注册API  (其实很简单，就是注册一下服务提供者)
    public static void registerProvider(String name, SubwayProviderInterface p) {
        providers.put(name, p);
    }

    //四大组成之四：服务访问API   (客户端只需要传递一个name参数，系统会去匹配服务提供者，然后提供服务)  (静态工厂方法)
    public static SubWayInterface getService(String name) {

        SubwayProviderInterface p = providers.get(name);

        if (p == null) throw new IllegalArgumentException( "No provider registered with name:" + name);

        return p.getService();

    }

}
