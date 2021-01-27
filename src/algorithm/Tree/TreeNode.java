package algorithm.Tree;

public class TreeNode<Key, Value> {

    private Key key;
    private Value value;
    public TreeNode left;
    public TreeNode right;

    private TreeNode(Key key, Value value, TreeNode left, TreeNode right){
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode TreeNode1(Key key, Value value, TreeNode left, TreeNode right){
        return new TreeNode(key, value, left,right);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
