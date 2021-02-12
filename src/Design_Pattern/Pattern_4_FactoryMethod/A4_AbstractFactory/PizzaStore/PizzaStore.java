package Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.PizzaStore;


import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.Pizza.Pizza;

public abstract class PizzaStore {

        public Pizza orderPizza(String type ) {
            Pizza pizza;

            pizza = createPizza(type);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            //take out!
            return pizza;
        }

        //在PizzaStore里，工厂方法现在是抽象的
        protected abstract Pizza createPizza(String type);
}
