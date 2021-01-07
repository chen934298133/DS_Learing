package Effective_Java.Chapter_2.Item_1;

public class Item_1 {
    public static void main(String[] args){

        // 使用构造器
        GenerateOrder_Constructor gc1 = new GenerateOrder_Constructor(200D);
        GenerateOrder_Constructor gc2 = new GenerateOrder_Constructor(1,200D);
        GenerateOrder_Constructor gc3 = new GenerateOrder_Constructor(1,200D, "深圳");
        System.out.println(gc1.count);
        System.out.println(gc2.count);
        System.out.println(gc3.count);

        // 使用静态工厂
        GenerateOrder_StaticFactoryMethods gs1 = GenerateOrder_StaticFactoryMethods.generateOrder(200D);
        GenerateOrder_StaticFactoryMethods gs2 = GenerateOrder_StaticFactoryMethods.generateOrder(1,200D);
        GenerateOrder_StaticFactoryMethods gs3 = GenerateOrder_StaticFactoryMethods.generateOrder(1, 200D, "深圳");
        System.out.println(gs1.getAddress());
        System.out.println(gs2.getAddress());
        System.out.println(gs3.getAddress());
    }
}
