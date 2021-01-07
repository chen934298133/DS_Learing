package LeetCode_2020.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
// 中序
public class BinaryTree_94_inorderTraversal {

    // 递归法
    public List<Integer> inorderTraversal(TreeNode root){
    List<Integer> res = new ArrayList();
        bfs(root,res);
        return res;
    }

    private void bfs(TreeNode root,List<Integer> res){
        if(root == null) return;
        bfs(root.left,res);
        res.add(root.val);
        bfs(root.right,res);
    }

    //迭代法
    public List<Integer> inorderTraversal_2(TreeNode root){
        List<Integer> res1 = new ArrayList();
        Deque<TreeNode> stack = new LinkedList();
        while (root != null || !stack.isEmpty()){
            if (root != null) {
//                res1.add(root.val);
                stack.push(root);
                root = root.left;
            }else {
                TreeNode node = stack.pop();
                res1.add(node.val);
                root = node.right;
            }
        }
        return res1;
    }
}
