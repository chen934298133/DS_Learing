package LeetCode_2021.Coding_2021_02_04;

import java.util.LinkedList;

public class Offer09 {

    /**
     * A 栈只负责添加
     * B栈负责将A栈的元素弹出后存储下来，然后弹出达到换序的效果
     */
    LinkedList<Integer> A, B;

        public  Offer09() {
            A = new LinkedList<Integer>();
            B = new LinkedList<Integer>();
        }

        public void appendTail(int value) {
            A.addLast(value);
        }

        public int deleteHead() {

            // 三种情况

            // 在B栈有元素时，无序从A栈调取，直接弹栈
            if(!B.isEmpty()) return B.removeLast();

            // 在B栈为空，且A栈为空时直接退出
            if(A.isEmpty()) return -1;

            // 在B栈为空，A栈不为空时，先从A栈调取元素
            while(!A.isEmpty())
                B.addLast(A.removeLast());

            // 然后弹栈
            return B.removeLast();
        }

        public static void main(String[] args){
            Offer09 o1 = new Offer09();
            o1.appendTail(1);
            o1.appendTail(2);
            o1.appendTail(3);
            System.out.println(o1.deleteHead());
        }
}
