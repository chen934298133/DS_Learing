package LeetCode_2020.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
//后序
public class BinaryTree_145_postorderTraversal {

    //递归法
    public List<Integer> postorderTraversal(TreeNode root ){
    List<Integer> res = new ArrayList();
        bfs(root,res);
        return res;
    }

    private void bfs(TreeNode root, List<Integer> res){
        if(root == null) return;
        bfs(root.left, res);
        bfs(root.right, res);
        res.add(root.val);
    }

    //迭代法 100% 79%
    public List<Integer> postorderTraversal_2(TreeNode root){
        List<Integer> res = new ArrayList();
        if(root == null)return res;

        LinkedList <TreeNode> stack = new LinkedList<>();
        LinkedList <TreeNode> stackTemp = new LinkedList<>();
        stackTemp.push(root);
        while (!stackTemp.isEmpty()){
            TreeNode curNode = stackTemp.pop();
            stack.push(curNode);
            if (curNode.left !=null) stackTemp.push(curNode.left);
            if (curNode.right !=null) stackTemp.push(curNode.right);
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop().val);
        }
        return res;

    }

    //迭代法二 58% 49%
    public List<Integer> postorderTraversal_3(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        TreeNode last = null;
        while(cur != null || !stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == last) { // 右孩子为空或者访问过了
                res.add(cur.val);
                stack.pop();
                last = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
        return res;
    }
}





class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 如果树为空，直接返回null
        if(root == null) return null;
        // 如果 p和q中有等于 root的，那么它们的最近公共祖先即为root（一个节点也可以是它自己的祖先）
        if(root == p || root == q) return root;
        // 递归遍历左子树，只要在左子树中找到了p或q，则先找到谁就返回谁
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // 递归遍历右子树，只要在右子树中找到了p或q，则先找到谁就返回谁
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 如果在左子树中 p和 q都找不到，则 p和 q一定都在右子树中，右子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
        if(left == null) return right;
        // 否则，如果 left不为空，在左子树中有找到节点（p或q），这时候要再判断一下右子树中的情况，如果在右子树中，p和q都找不到，则 p和q一定都在左子树中，左子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
        else if(right == null) return left;
        //否则，当 left和 right均不为空时，说明 p、q节点分别在 root异侧, 最近公共祖先即为 root
        else return root;
    }
}