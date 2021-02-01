package Design_Pattern.StaticFactory;

public class Pizza {
    private String name;
    private String dough;

    private Pizza(String name, String dough){
        this.name = name;
        this.dough = dough;
    }

    private Pizza(String name){
        this.name = name;
    }

    public static Pizza pizza_n(String name){
        return new Pizza(name);
    }

    public static Pizza pizza_n_d(String name, String dough){
        return new Pizza(name, dough);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                '}';
    }
}
