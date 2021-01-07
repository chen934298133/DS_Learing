package LeetCode_2020.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
//前序
public class BinaryTree_144_preorderTraversal {

    //递归法
    public List<Integer> preorderTraversal(TreeNode root ){
        List<Integer> res = new ArrayList();
        bfs(root,res);
        return res;
    }

    private void bfs(TreeNode root,List<Integer> res){
        if(root == null) return;
        res.add(root.val);
        bfs(root.left,res);
        bfs(root.right,res);
    }

    //迭代法
    public List<Integer> preorderTraversal_2(TreeNode root){
        List<Integer> res1 = new ArrayList();
        Deque<TreeNode> stack = new LinkedList();
        while (root != null || !stack.isEmpty()){
            if (root != null) {
                res1.add(root.val);//
                stack.push(root);
                root = root.left;
            }else {
                TreeNode node = stack.pop();
//                res1.add(node.val);
                root = node.right;
            }
        }
        return res1;
    }



    //递归法练习
    public List<Integer> preorderTraversal_3(TreeNode root){
        List<Integer> res = new ArrayList<>();
        bfs2(root,res);
        return res;
    }

    public void bfs2(TreeNode root, List<Integer> res){
        if(root == null) return;
        res.add(root.val);
        bfs2(root.left,res);
        bfs2(root.right,res);
    }
}
