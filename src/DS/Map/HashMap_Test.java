package DS.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Test {
    public static void main(String[] args){

        Map<Character, Character> pairs = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
                put('1', '2');
                put('3', '4');
            }
        };
//        pairs.put(')','(');
//        System.out.println(pairs.containsKey(')'));
//        System.out.println(pairs.containsValue('('));
//        System.out.println(pairs.get(')'));
//        System.out.println(pairs.keySet());
//        System.out.println(pairs.values());
//
//        System.out.println(pairs.entrySet());
        System.out.println(pairs.get('1'));
    }
}
