package Effective_Java.Chapter_2.Item_1.Merit_5.ServiceManger;

import Effective_Java.Chapter_2.Item_1.Merit_5.ServiceProvider.SubwayProviderInterface;
import Effective_Java.Chapter_2.Item_1.Merit_5.Srvice.SubWayInterface;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServiceManager {

    private ServiceManager(){}

    private static final Map<String, SubwayProviderInterface> providers = new ConcurrentHashMap<>();

    public static void registerProvider(String name, SubwayProviderInterface p) {
        providers.put(name, p);
    }

    public static SubWayInterface getService(String name) {

        SubwayProviderInterface p = providers.get(name);

        if (p == null) throw new IllegalArgumentException( "No provider registered with name:" + name);

        return p.getService();

    }

}
