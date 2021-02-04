package algorithm.Tree.Test;

import algorithm.Linear_1.Queue_Code;
import algorithm.Tree.TreeNode;

import java.util.Iterator;

public class TreeNodeTest {
    public static void main(String[] args){
        TreeNode t0 = new TreeNode(0);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t2.left = t1;
        t1.left = t0;
        t2.right = t4;
        t4.left = t3;

        Iterator iterator = t2.preErgodic().iterator();
        Queue_Code queue = t2.preErgodic();
        System.out.println(queue.size());

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

//        System.out.println(t2);
//        System.out.println(t0.getVal());
    }
}
