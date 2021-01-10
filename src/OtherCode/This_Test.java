package OtherCode;

public class This_Test {
    private int age;
    private String name;

    public This_Test(int age, String name){
        this.age = age;
        this.name = name;
    }

    public This_Test(){
        this(1,"asd");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
