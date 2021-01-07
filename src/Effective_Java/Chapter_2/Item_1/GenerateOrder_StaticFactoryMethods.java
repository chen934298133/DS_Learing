package Effective_Java.Chapter_2.Item_1;

public class GenerateOrder_StaticFactoryMethods {

    private int count;
    private double money;
    private String address;

    private GenerateOrder_StaticFactoryMethods(int count, double money, String address){
        this.count = count;
        this.money = money;
        this.address = address;
    }

    // 仅仅是需要money
    public static GenerateOrder_StaticFactoryMethods generateOrder(double money){
        return new GenerateOrder_StaticFactoryMethods(0, money, null);
    }

    // 需参数为count、money。
    public static GenerateOrder_StaticFactoryMethods generateOrder(int count, double money){
        return new GenerateOrder_StaticFactoryMethods(count, money, null);
    }

    // 需参数为count、money、address。
    public  static GenerateOrder_StaticFactoryMethods generateOrder(int count, double money, String address){
        return new GenerateOrder_StaticFactoryMethods(count, money, address);
    }

    public int getCount() {
        return count;
    }

    public double getMoney() {
        return money;
    }

    public String getAddress() {
        return address;
    }
}
