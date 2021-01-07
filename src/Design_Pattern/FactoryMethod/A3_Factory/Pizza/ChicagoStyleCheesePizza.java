package Design_Pattern.FactoryMethod.A3_Factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "ChicagoCheese";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("11111111111111111!!!!!!!");
        toppings.add("22222222222222222!!!!!!!");
        toppings.add("33333333333333333!!!!!!!");
    }

    public void cut(){
        System.out.println("Cutting the pizza into square slices!");
    }
}
