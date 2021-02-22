package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 动态地创建对象，通过反射
public class Test06 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("Reflection.Person");

        // 构造一个对象
        Person p = (Person) c1.newInstance(); // 本质上调用无参构造器
        System.out.println(p);


        // 通过构造器创建对象
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        Person person = (Person) declaredConstructor.newInstance("chen", 22, 180);
        System.out.println(person);

        // 通过反射调用普通方法
        Person person1 = (Person) c1.newInstance();
        // 通过反射获取一个方法
        Method setName = c1.getMethod("setName", String.class);
        // invoke : 激活
        setName.invoke(person1,"che");
        System.out.println(person1.getName());

        // 通过反射操作属性
        Person person2 = (Person) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        // 由于 name 是 private 的，需要 SetAccessible 关闭安全检测
        name.setAccessible(true);
        name.set(person2,"c");
        System.out.println(person2.getName());
    }
}
