package Effective_Java.Chapter_2.Item_1.Merit_1;

public class Merit_2_Test {
    public static void main(String[] args){

        // 使用构造器
        GenerateOrder_Constructor gc1 = new GenerateOrder_Constructor(200D);
        GenerateOrder_Constructor gc2 = new GenerateOrder_Constructor(1, 200D);
        GenerateOrder_Constructor gc3 = new GenerateOrder_Constructor(1, 200, "深圳");
        System.out.println(gc3.getMoney());
        System.out.println(gc3.getCount());
        System.out.println(gc3.getAddress());
        System.out.println();

        // 使用静态工厂
        GenerateOrder_StaticFactoryMethods gs1 = GenerateOrder_StaticFactoryMethods.generateOrderByA(200D);
        GenerateOrder_StaticFactoryMethods gs2 = GenerateOrder_StaticFactoryMethods.generateOrderByB(1, 200D);
        GenerateOrder_StaticFactoryMethods gs3 = GenerateOrder_StaticFactoryMethods.generateOrderByC(1, 200D, "深圳");
        System.out.println(gs1.getMoney());
        System.out.println(gs2.getCount());
        System.out.println(gs3.getAddress());
    }
}
