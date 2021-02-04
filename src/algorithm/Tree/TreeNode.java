package algorithm.Tree;

import algorithm.Linear_1.Queue_Code;

public class TreeNode<Key, Value, T> {

    private T val;
    private Key key;
    private Value value;
//    public TreeNode root;
    public TreeNode left;
    public TreeNode right;

//    private TreeNode(Key key, Value value, TreeNode left, TreeNode right){
//        this.key = key;
//        this.value = value;
//        this.left = left;
//        this.right = right;
//    }
//
//    public static TreeNode treeNodeA (Key key, Value value, TreeNode left, TreeNode right){
//
//    }


    public  TreeNode (Key key, Value value, TreeNode left, TreeNode right){
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode(T val){
        this.setVal(val);
//        this.root = new TreeNode(val);
    }

    public Queue_Code<T> preErgodic(){
        Queue_Code<T> queue = Queue_Code.queue();
        preErgodic(this, queue);
        return queue;
    }

    private void preErgodic(TreeNode tree, Queue_Code<T> queue){

        if (tree == null){
            return;
        }

        queue.add((T) tree.getVal());

        if (tree.left != null){
            preErgodic(tree.left, queue);
        }

        if (tree.right != null){
            preErgodic(tree.right, queue);
        }
    }


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
