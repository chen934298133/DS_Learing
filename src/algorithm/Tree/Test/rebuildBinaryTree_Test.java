package algorithm.Tree.Test;


import algorithm.Linear_1.Queue_Code;
import algorithm.Tree.TreeNode;
import algorithm.Tree.rebuildBinaryTree_pre_mid;

import java.util.Iterator;

public class rebuildBinaryTree_Test {
    public static void main(String[] args){
        rebuildBinaryTree_pre_mid rebuild = new rebuildBinaryTree_pre_mid();
        int[] pre = {2,1,0,4,3};
        int[] mid = {1,0,2,4,3};
        TreeNode tree = rebuild.buildTree(pre, mid);
        Queue_Code treeToString = tree.preErgodic();
        System.out.println("size: " + treeToString.size());
//        System.out.println(tree.getVal());
//        System.out.println(tree.getVal());
//        System.out.println(tree.left.getVal());
//        System.out.println(tree.right.getVal());



        Iterator iterator = tree.preErgodic().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
