package JVM;

public class Difference_Class_New_Test {

    // 类(class)是模板, 对象(new ***)是具体的
    public static void main(String[] args){

        // new 的对象, JVM 都会给它分配一个新的内存空间
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        // 创建对象的引用地址不一样，但是都是一个 Class(Car) 出来的
        Class<? extends Car> aClass1 = car1.getClass();
        Class<? extends Car> aClass2 = car2.getClass();
        Class<? extends Car> aClass3 = car3.getClass();

        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
        System.out.println(aClass3.hashCode());
    }
}
