package Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList();

    public void prepare(){
        System.out.println("Preparing "  + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        if (toppings.size() != 0){
            System.out.println("Adding topping: ");
            for (String t : toppings  ) {
                System.out.println("  " + t);
            }
        }
    }

    public void bake(){
        System.out.println("baking !");
    }

    public void cut(){
        System.out.println("cutting ! ");
    }

    public void box(){
        System.out.println("boxing !");
        System.out.println("-----------next------------");
    }

    String getName(){
        return this.name;
    }
}
