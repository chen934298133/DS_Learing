package LeetCode_2021.Coding_2021_06_16;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
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
        System.out.println(Arrays.toString(levelOrder(t2)));
    }
    public static int[] levelOrder(TreeNode root) {
        // 1. 当树的根节点为空，则直接返回空列表 [] ；
        if(root == null) return new int[0];

        // 2. 初始化容器
        // Queue: 包含根节点的队列 queue = [root]
        // List: 打印结果列表 res = []
        Queue<TreeNode> queue = new LinkedList(){{ add(root); }};
        ArrayList<Integer> ans = new ArrayList<>();

        // 3. 当队列 queue 为空时跳出；
        while(!queue.isEmpty()) {
            // 1. 出队： 队首元素出队，记为 node；
            TreeNode node = queue.poll();
            // 2. 将 node.val 添加至列表 tmp 尾部；
            ans.add(node.val);
            // 3. 添加子节点： 若 node 的左（右）子节点不为空，则将左（右）子节点加入队列 queue ；
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }

        // 将 List 转为 int数组并返回
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            res[i] = ans.get(i);
        }
        System.out.println(Arrays.toString(ans.toArray()));
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
