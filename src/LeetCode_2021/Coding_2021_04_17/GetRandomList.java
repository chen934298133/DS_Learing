package LeetCode_2021.Coding_2021_04_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GetRandomList {

    public static void main(String[] args) {
        List tempList = new ArrayList();
        // 返回抽取记录
        int backSum = 8;
        Random random = new Random();
        List list = new ArrayList();
        List resultList = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        System.out.println(list.toString());

        for (int i = 0; i < backSum; i++) {
//			随机数的范围为0-list.size()-1
            int target = random.nextInt(list.size());
            if (!tempList.contains(target)) {
                tempList.add(target);
                resultList.add(list.get(target));
            } else {
                i--;
            }
//            allRecordList.remove(target);
        }
        System.out.println(resultList);
    }


    public static <T>List<T> getRandomListDocVo(List<T> sourceList) {
        List<Integer> tempList = new ArrayList<Integer>();
        List<T> result = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int random = new Random().nextInt(sourceList.size());
            if (!tempList.contains(random)) {
                tempList.add(random);
                result.add(sourceList.get(random));
            } else {
                i--;
            }
        }
        return result;
    }


}
