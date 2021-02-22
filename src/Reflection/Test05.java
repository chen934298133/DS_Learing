package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 获得类的信息
public class Test05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("Reflection.Person");

        // 获取类的名字
        System.out.println(c1.getName());       // 获得包名 + 类名
        System.out.println(c1.getSimpleName()); // 获得类名

        // 获得类的属性
        System.out.println("------------获得类的属性------------");
        Field [] fields = c1.getFields();       // 只能找到public属性

        fields = c1.getDeclaredFields();      // 可以找到全部的属性
        for (Field field : fields){
            System.out.println(field);
        }

        System.out.println("------------获得指定属性的值------------");
        // 获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        System.out.println("------------获取类的方法------------");
        // 获取类的方法
        Method[] methods = c1.getMethods();
        for (Method method : methods){
            System.out.println("getMethods: " + method);
        }

        methods = c1.getDeclaredMethods();
        for (Method method : methods){
            System.out.println("getDeclaredMethods: " + method);
        }

        System.out.println("------------获得指定方法------------");
        // 获得指定方法
        Method getName = c1.getMethod("getName",null);
        System.out.println(getName);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(setName);

        System.out.println("------------获取指定的构造器------------");
        // 获取指定的构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor);
        }
        constructors = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor);
        }

        Constructor constructorDeclared = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定: " + constructorDeclared);
    }
}
