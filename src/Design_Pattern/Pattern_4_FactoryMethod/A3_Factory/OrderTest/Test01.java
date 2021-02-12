package Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.OrderTest;

import Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.PizzaStore.ChicagoStylePizzaStore;
import Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.PizzaStore.NYStylePizzaStore;

public class Test01 {
    public static void main(String[] args){
        NYStylePizzaStore NY1 = new NYStylePizzaStore();
        NY1.orderPizza("NYCreek");

        ChicagoStylePizzaStore C1 = new ChicagoStylePizzaStore();
        C1.orderPizza("ChicagoCheese");
    }
}
