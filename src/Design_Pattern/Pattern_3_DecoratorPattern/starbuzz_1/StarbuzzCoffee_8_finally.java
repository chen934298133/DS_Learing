package Design_Pattern.Pattern_3_DecoratorPattern.starbuzz_1;

public class StarbuzzCoffee_8_finally {

    public static void main(String[] args){
        Beverage_1 beverage = new Espresso_3();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 双倍摩卡 + 豆浆奶泡 的深焙咖啡
        Beverage_1 beverage2 = new DarkRoast();
        beverage2 = new Mocha_5(beverage2);
        beverage2 = new Mocha_5(beverage2);
        beverage2 = new Whip_7(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage_1 beverage3 = new HouseBlend_4();
        beverage3 = new Soy_6(beverage3);
        beverage3 = new Mocha_5(beverage3);
        beverage3 = new Whip_7(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
