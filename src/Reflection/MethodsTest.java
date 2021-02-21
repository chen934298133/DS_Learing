package Reflection;

import java.lang.Class;
import java.lang.reflect.Method;        // 代表类的方法
import java.lang.reflect.Field;         // 代表类成员
import java.lang.reflect.Constructor;   // 代表类构造器

/**
 * 查阅 API 可以看到 Class 有很多方法：
 *
 * 　　getName()：获得类的完整名字。
 * 　　getFields()：获得类的public类型的属性。
 * 　　getDeclaredFields()：获得类的所有属性。包括private 声明的和继承类
 * 　　getMethods()：获得类的public类型的方法。
 * 　　getDeclaredMethods()：获得类的所有方法。包括private 声明的和继承类
 * 　　getMethod(String name, Class[] parameterTypes)：获得类的特定方法，name参数指定方法的名字，parameterTypes 参数指定方法的参数类型。
 * 　　getConstructors()：获得类的public类型的构造方法。
 * 　　getConstructor(Class[] parameterTypes)：获得类的特定构造方法，parameterTypes 参数指定构造方法的参数类型。
 * 　　newInstance()：通过类的不带参数的构造方法创建这个类的一个对象。
 */
public class MethodsTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        Person p1 = new Person();
        // 1、通过对象调用 getClass() 方法来获取,通常应用在：比如你传过来一个 Object 类型的对象，而我不知道你具体是什么类，用这种方法
        Class c1 = p1.getClass();
        // 2、直接通过 类名.class 的方式得到,该方法最为安全可靠，程序性能更高,这说明任何一个类都有一个隐含的静态成员变量 class
        Class c2 = Person.class;
        // 3、通过 Class 对象的 forName() 静态方法来获取，用的最多，但可能抛出 ClassNotFoundException 异常
        try {
            Class c3 = Class.forName("Reflection.Person");
            System.out.println(c3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 1. 获得类完整的名字
        String className = c2.getName();
        System.out.println(className);

        // 2. 获得类的public类型的属性。 //public int age
        Field[] fields = c2.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        // 获得类的所有属性。包括私有的   //private String name, public int age
        Field [] allFields = c2.getDeclaredFields();
        for (Field f : allFields ) {
            System.out.println(f.getName());
        }

        // 获得类的public类型的方法。这里包括 Object 类的一些方法
        Method[] methods = c2.getMethods();
        for (Method m : methods){
            System.out.println(m.getName());
        }

        // 获得类的所有方法。
        Method[] allMethods = c2.getDeclaredMethods();
        for (Method m : allMethods){
            System.out.println(m.getName());
        }

        // 获得指定的属性
        Field f1 = c2.getField("age");
        System.out.println(f1.getName());

        // 获得指定的私有属性
        Field f2 = c2.getDeclaredField("name");
        System.out.println(f2.getName());

        // 启用和禁用访问安全检查的开关，值为 true，则表示反射的对象在使用时应该取消 java 语言的访问检查；反之不取消
        f2.setAccessible(true);
        System.out.println(f2);

        //创建这个类的一个对象
        Object p2 = c2.newInstance();
        //将 p2 对象的  f2 属性赋值为 Bob，f2 属性即为 私有属性 name
        f2.set(p2, "Bob");
        //使用反射机制可以打破封装性，导致了java对象的属性不安全。
        System.out.println(f2.get(p2)); // Bob
        //获取构造方法
        Constructor[] constructors = c2.getConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor.toString());
        }

    }
}
