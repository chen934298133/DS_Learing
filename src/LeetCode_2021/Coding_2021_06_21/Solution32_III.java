package LeetCode_2021.Coding_2021_06_21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution32_III {
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

        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a3.right = a5;
        System.out.println(levelOrder(a1));
        System.out.println(levelOrder2(a1));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        // 1. 当树的根节点为空，则直接返回空列表 [] ；
        if (root == null) return new ArrayList<>();

        // 2. 初始化容器
        // Queue: 包含根节点的队列 queue = [root]
        // resultList: 打印结果列表 resultList = []
        Queue<TreeNode> queue = new LinkedList() {{
            add(root);
        }};
        ArrayList<List<Integer>> resultList = new ArrayList<>();
        int index = 0;
        while (!queue.isEmpty()) {
            ArrayList<Integer> ans = new ArrayList<>();
            // 若当前节点子节点不为空，则遍历子节点个数的次数（此处不再是遍历至队列为空）
            // 也可理解为每次获取当前层个数，然后遍历该次数
            index++;
            for (int i = queue.size(); i > 0; i--) {
                // 1. 出队： 队首元素出队，记为 node；
                TreeNode node = queue.poll();
                // 2. 将 node.val 添加至列表 tmp 尾部；
                ans.add(node.val);
                // 3. 添加子节点： 若 node 的左（右）子节点不为空，则将左（右）子节点加入队列 queue ；
                if (index % 2 == 1) {
                    if (node.right != null) queue.add(node.right);
                    if (node.left != null) queue.add(node.left);
                } else {
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            resultList.add(ans);
        }
        return resultList;
    }

    /*
    *
        利用双端队列的两端皆可添加元素的特性，设打印列表（双端队列） tmp ，并规定：
        奇数层 则添加至 tmp 尾部 ，
        偶数层 则添加至 tmp 头部 。


        算法流程：
        特例处理： 当树的根节点为空，则直接返回空列表 [] ；
        初始化： 打印结果空列表 res ，包含根节点的双端队列 deque ；
        BFS 循环： 当 deque 为空时跳出；
        新建列表 tmp ，用于临时存储当前层打印结果；
        当前层打印循环： 循环次数为当前层节点数（即 deque 长度）；
        出队： 队首元素出队，记为 node；
        打印： 若为奇数层，将 node.val 添加至 tmp 尾部；否则，添加至 tmp 头部；
        添加子节点： 若 node 的左（右）子节点不为空，则加入 deque ；
        将当前层结果 tmp 转化为 list 并添加入 res ；
        返回值： 返回打印结果列表 res 即可

    * */
    // 层序遍历 + 双端队列（想明白为什么是在打印节点的时候使用双端）
    // 而开始的时候你却在添加子节点的地方，导致怎么都不对
    public static List<List<Integer>> levelOrder2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (res.size() % 2 == 0) tmp.addLast(node.val); // 偶数层 -> 队列头部
                else tmp.addFirst(node.val); // 奇数层 -> 队列尾部
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
}