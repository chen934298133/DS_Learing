package Design_Pattern.Pattern_4_FactoryMethod.A1_SimpleOrigin.Test;

import Design_Pattern.Pattern_4_FactoryMethod.A1_SimpleOrigin.PizzaStore.PizzaStore;

public class Test01 {
    public static void main(String[] args){
          PizzaStore o1 = new PizzaStore();
          o1.orderPizza("cheese");
    }
}
