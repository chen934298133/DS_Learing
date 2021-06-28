package LeetCode_2021.Coding_2021_06_22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
TreeNode t0 = new TreeNode(0);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t2.left = t1;
        t1.left = t0;
        t2.right = t4;
        t4.left = t3;
        System.out.println(maxDepth(t2));
    }


    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        // 初始化
        List<TreeNode> queue = new LinkedList() {{ add(root); }}, tmp;
        int res = 0;
        // 循环遍历： 当 queue 为空时跳出。
        while (!queue.isEmpty()) {
            // 若初始化一个空列表 tmp ，用于临时存储下一层节点；
            tmp = new LinkedList<>();
            // 遍历队列： 遍历 queue 中的各节点 node ，并将其左子节点和右子节点加入 tmp；
            for (TreeNode node : queue) {
                if (node.left != null) tmp.add(node.left);
                if (node.right != null) tmp.add(node.right);
            }
            // 更新队列： 执行 queue = tmp ，将下一层节点赋值给 queue；
            queue = tmp;
            // 统计层数： 执行 res += 1 ，代表层数加 11；
            res++;
        }

        return res;
    }
}

