package Reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// 练习反射操作注解
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("Reflection.Student1");

        System.out.println(c1.getAnnotations().length);
        // 通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获取注解的value值
        TableChen tableChen = (TableChen) c1.getAnnotation(TableChen.class);
        String value = tableChen.value();
        System.out.println(value);

        // 获取类指定的注解
        Field f = c1.getDeclaredField("name");
        FieldChen annotation = f.getAnnotation(FieldChen.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.length());
        System.out.println(annotation.type());
    }
}

@TableChen("db_student")
class Student1 {

    @FieldChen(columnName = "db_name", type = "varchar", length = 3)
    private String name;
    @FieldChen(columnName = "db_id", type = "int", length = 10)
    private int id;
    @FieldChen(columnName = "db_age", type = "int", length = 10)
    private int age;

    public Student1(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Student1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// 类名的注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface TableChen{
    String value();
}

// 属性的注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface FieldChen{
    String columnName();
    String type();
    int length();
}