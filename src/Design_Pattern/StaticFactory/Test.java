package Design_Pattern.StaticFactory;

public class Test {
    public static void main(String[] args){
        Pizza p1 = Pizza.pizza_n("披萨饼");
        Pizza p2 = Pizza.pizza_n_d("pizza_dough","dough");
        System.out.println("p1 :" + p1.toString());
        System.out.println("p2 :" + p2.toString());
    }
}
