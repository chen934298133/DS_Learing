package algorithm.Linear.Test;

import algorithm.Linear.SequenceList_FirstEdition;
import algorithm.Linear.SequenceList_SecondEdition;

public class SequenceListCapacityTest {
    public static void main(String[] args){
        SequenceList_FirstEdition<String > s1 = SequenceList_FirstEdition.sequenceList_firstVersion1(2);
        s1.insert("z1");
        s1.insert("z2");
        s1.insert("z3");

        SequenceList_SecondEdition<String> s2 = SequenceList_SecondEdition.sequenceList_secondEdition(2);
        s2.insert("s1");
        s2.insert("s2");
        s2.insert("s3");
        s2.insert("s4");
        System.out.println(s2.get(3));
    }
}
