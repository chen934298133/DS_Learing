package LeetCode_2020.Tree;

import java.util.HashMap;

public class BinaryTree_Offer07 {
    int[] preorder;
    HashMap<Integer, Integer> dic = new HashMap<>();

    public static void main(String[] args){
//        TreeNode t1 = new TreeNode(3)
        int [] pre = {3,9,2,1,7};
        int [] in = {9,3,2,1,7};
        BinaryTree_Offer07 b1 = new BinaryTree_Offer07();
        System.out.println(b1.buildTree(pre, in));
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++)
            dic.put(inorder[i], i);
        return recur(0, 0, inorder.length - 1);
    }

    TreeNode recur(int root, int left, int right) {
        if(left > right) return null;                          // 递归终止
        TreeNode node = new TreeNode(preorder[root]);          // 建立根节点
        int i = dic.get(preorder[root]);                       // 划分根节点、左子树、右子树
        System.out.println(i+"---------");
        System.out.println(root+"------");
        node.left = recur(root + 1, left, i - 1);              // 开启左子树递归
        node.right = recur(root + i - left + 1, i + 1, right); // 开启右子树递归
        return node;                                           // 回溯返回根节点
    }

}
