package DS.Set;

import java.util.HashSet;

public class HashSet_Test {
    public static void main(String[] args){
        HashSet_Test h1 = new HashSet_Test();
        HashSet<Integer> set = new HashSet<>();
        int [] array = {1,2,3,4,5,6,6};
        for( int temp : array){
            System.out.println(set.add(temp));
        }
    }
}
