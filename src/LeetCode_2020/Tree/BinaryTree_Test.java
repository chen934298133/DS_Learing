package LeetCode_2020.Tree;

import DS.Tree.BinaryTree;

import java.util.List;

/**
 *     3
 *   /   \
 *  1     4
 *   \     \
 *    2     5
 */
// [3,1,4,null,2,null,5]
public class BinaryTree_Test {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);

        t3.left = t1;
        t3.right = t4;
        t1.right = t2;
        t4.right = t5;

        BinaryTree_94_inorderTraversal sort1 = new BinaryTree_94_inorderTraversal();
        List l1 = sort1.inorderTraversal(t3);
        List l11 = sort1.inorderTraversal_2(t3);
        System.out.println("递归——中序遍历： "+l1);
        System.out.println("迭代——中序遍历： "+l11);
        System.out.println("_____________________");


        BinaryTree_144_preorderTraversal sort2 = new BinaryTree_144_preorderTraversal();
        List l2 = sort2.preorderTraversal(t3);
        List l22 = sort2.preorderTraversal_2(t3);
        List l23 = sort2.preorderTraversal_3(t3);
        System.out.println("递归——前序遍历： "+l2);
        System.out.println("迭代——前序遍历： "+l22);
        System.out.println("迭代——前序遍历： "+l23);
        System.out.println("_______________");

        BinaryTree_145_postorderTraversal sort3 = new BinaryTree_145_postorderTraversal();
        List l3 = sort3.postorderTraversal(t3);
        List l33 = sort3.postorderTraversal_2(t3);
        List l333 = sort3.postorderTraversal_3(t3);
        System.out.println("递归——后序遍历： "+l3);
        System.out.println("迭代——后序遍历： "+l33);
        System.out.println("迭代——后序遍历： "+l333);
    }
}
