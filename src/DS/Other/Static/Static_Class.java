package DS.Other.Static;

public class Static_Class {
    // 一个实例变量一个静态变量
    // An instance variable ，A static variable
    private int a;
    private static int b;

    //一个静态方法，一个非静态方法
    //A static method, a non-static method
    public static void say(){}

    public void test(){
        // 在外部类中调用内部类的属性和方法
        Static_Class.Inner.c = 1; // 可以通过静态内部类的全类名来调用静态内部类的静态属性（外部类名.静态内部类名.属性）
        Static_Class.Inner.go(); // 可以通过静态内部类的全类名来调用静态内部类的静态方法（外部类名.静态内部类名.方法）
        // Outer.Inner.walk(); //不能通过类静态内部类的全类名来调用内部类的非静态属性和方法
        Inner inner = new Inner(); //可以通过创建内部类实例来调用静态内部类的非静态属性和方法
        inner.d = 1;
        inner.walk();
    }

    //静态内部类
    //Static internal class
    public static class Inner{
        static int c;
        int d;

        // 一个匿名代码块、一个静态代码块
        //An anonymous block of code, a static block of code
        {}
        static{}

        //A static method, a non-static method
        public static void go(){}
        public void walk(){
            // 在静态内部类中调用外部类的属性和方法
            int f = b; // 可以直接调用外部类的静态属性
            say(); // 可以直接调用外部类的静态方法
            // int e = a; 直接调用外部类的非静态属性出错编译出错
            // test(); 直接调用外部类的非静态方法时编译出错
            Static_Class outer = new Static_Class();
            int e = outer.a; // 可以通过创建外部类实例来调用外部类的非静态属性
            outer.test(); // 可以通过创建外部类实例来调用外部类的非静态方法
        }
    }
}
