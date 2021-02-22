package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 分析性能问题
public class Test07 {


    // 普通方法调用
    public static void test01() {
        Person person = new Person();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            person.getName();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("普通方法执行100万次的时间: " + (endTime - startTime) + "ms");
    }

    // 反射方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        Class c2 = person.getClass();
        Method getName = c2.getDeclaredMethod("getName", null);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            getName.invoke(person, null);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("反射方式调用执行数次的时间: " + (endTime - startTime) + "ms");
    }

    // 反射方式调用，关闭检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        Class c2 = person.getClass();
        Method getName = c2.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            getName.invoke(person, null);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("反射方式调用，关闭检测执行数次的时间: " + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }
}
