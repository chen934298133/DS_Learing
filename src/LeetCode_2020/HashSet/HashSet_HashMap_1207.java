package LeetCode_2020.HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSet_HashMap_1207 {
    public static void main(String[] args){
        HashSet_HashMap_1207 h = new HashSet_HashMap_1207();
        int[] arr = {1,2,2,1,1,3};
        System.out.println(h.uniqueOccurrences(arr));


//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//        }
//        System.out.println(map.entrySet());
//        System.out.println(map.values());
    }

    public boolean uniqueOccurrences(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> x : map.entrySet() ){
            set.add(x.getValue());
        }
        return set.size() == map.size();
    }
}
