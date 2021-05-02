package LeetCode_2021.Coding_2021_05_01;

import java.util.*;

public class LeetCode_554 {

    public int leastBricks(List<List<Integer>> wall) {
        int result = wall.size();
        int edges = wall.size();
        Map<Integer, Integer> map = new HashMap();
        List<List<Integer>> listAll = new ArrayList<>();
        for (int i = 0; i < wall.size(); i++) {
            List<Integer> tempList = new ArrayList<>();
            int num = 0;
            for (Integer integer : wall.get(i)) {
                num += integer;
                tempList.add(num);
//                edges = Math.max(edges, num);
            }
            tempList.remove(tempList.size() - 1);
            listAll.add(tempList);
        }
        for (List<Integer> integers : listAll) {
            for (Integer integer : integers) {
                int i = map.getOrDefault(integer, 0) + 1;
                map.put(integer, i);
                result = Math.min(result, edges - i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(1);
        list2.add(2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(2);
        List<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(4);
        List<Integer> list5 = new ArrayList<>();
        list5.add(3);
        list5.add(1);
        list5.add(2);
        List<Integer> list6 = new ArrayList<>();
        list6.add(1);
        list6.add(3);
        list6.add(1);
        list6.add(1);
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
        list.add(list6);
        System.out.println(list.toString());

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list7 = new ArrayList<>();
        list7.add(1);
        list7.add(1);
        List<Integer> list8 = new ArrayList<>();
        list8.add(2);
        List<Integer> list9 = new ArrayList<>();
        list9.add(1);
        list9.add(1);
        lists.add(list7);
        lists.add(list8);
        lists.add(list9);
        LeetCode_554 l = new LeetCode_554();
        System.out.println(l.leastBricks(lists));
    }
}
