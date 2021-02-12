package DS.Set;

import java.util.HashSet;

public class HashSet_Test {
    public static void main(String[] args){

        HashSet<Integer> set = new HashSet<>();
        int [] array = {4,5,2,6,1,0,8,7,9,0};
        for( int temp : array){
            System.out.println(set.add(temp));
        }
        System.out.println(set.clone());
    }
}
