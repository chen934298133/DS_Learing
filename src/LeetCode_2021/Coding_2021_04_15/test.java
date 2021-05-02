package LeetCode_2021.Coding_2021_04_15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args){
        int i = 5;
        Map<String, String> map = new HashMap<>();
        String[] strArr = new String[i];
        map.put("id","id");
        map.put("老人姓名","elderly_name");
        map.put("老人身份证号", "elderly_id_card");
        map.put("老人住址", "elderly_address");
        map.put("老人联系方式", "elderly_phone");
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(map.keySet());
    }
}
