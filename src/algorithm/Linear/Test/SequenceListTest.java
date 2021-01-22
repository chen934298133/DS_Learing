package algorithm.Linear.Test;

import algorithm.Linear.SequenceList_FirstEdition;

public class SequenceListTest {
    public static void main(String[] args){
//        SequenceList_FirstVersion<String> s1 = new SequenceList_FirstVersion<>(10);

        // 使用静态工厂新建对象
        SequenceList_FirstEdition<String> s1 = SequenceList_FirstEdition.sequenceList_firstVersion1(10);

        s1.insert("张1");
        s1.insert("张2");
        s1.insert("张3");
        s1.insert("张4");
        s1.insert(2,"张2.5");

        for (Object str : s1 ) {
            System.out.println(str);
        }

        // test get
        System.out.println(s1.get(1));
        // test deleat
        System.out.println(s1.remove(0));


    }
}
