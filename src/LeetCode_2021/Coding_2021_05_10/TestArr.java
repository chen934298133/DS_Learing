package LeetCode_2021.Coding_2021_05_10;

public class TestArr {
    public static void main(String[] args){
        Object[] obj= new Object[20];
        obj[0] = 1;
        obj[1] = 2;
        for (Object o : obj) {
            System.out.println(o);
        }
        obj[0] = 10;
        obj[1] = 20;
        obj[2] = 22;
        for (Object o : obj) {
            System.out.println(o);
        }

    }
}
