package Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.Z_OrderTest;

import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.PizzaStore.ChicagoPizzaStore;
import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.PizzaStore.NYPizzaStore;
import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.PizzaStore.PizzaStore;

public class Test01 {
    public static void main(String[] args){
        PizzaStore NY = new NYPizzaStore();
        NY.orderPizza("cheese");

        PizzaStore Chicago = new ChicagoPizzaStore();
        Chicago.orderPizza("greek");
    }
}
