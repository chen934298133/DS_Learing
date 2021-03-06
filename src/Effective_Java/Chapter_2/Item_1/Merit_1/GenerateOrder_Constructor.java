package Effective_Java.Chapter_2.Item_1.Merit_1;

public class GenerateOrder_Constructor {

    private int count;
    private double money;
    private String address;

    // 一个参数
    public GenerateOrder_Constructor(double money){
        this(0, money, null);
    }

    //两个参数
    public GenerateOrder_Constructor(int count, double money){
        this(count, money, null);
    }

    //三个参数
    public GenerateOrder_Constructor(int count, double money, String address){
        this.count = count;
        this.money = money;
        this.address =address;
    }

    public String getAddress() {
        return address;
    }

    public int getCount() {
        return count;
    }

    public double getMoney() {
        return money;
    }
}
