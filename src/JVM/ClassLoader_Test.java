package JVM;

public class ClassLoader_Test {
    // 类(class)是模板, 对象(new ***)是具体的
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        // 创建对象的引用地址不一样，但是都是一个 Class(Car) 出来的
        Class<? extends Car> aClass1 = car1.getClass();
        ClassLoader classLoader = aClass1.getClassLoader();
        System.out.println(classLoader);                            // AppClassLoader_应用程序加载器
        System.out.println(classLoader.getParent());                // ExtClassLoader_扩展类加载器
        System.out.println(classLoader.getParent().getParent());    // BootClassLoader_启动类（根）加载器        java程序获取不到，因为 获取扩展类加载器的父类加载器 --> 根加载器(用C++编写的，无法直接获取)
    }
}
