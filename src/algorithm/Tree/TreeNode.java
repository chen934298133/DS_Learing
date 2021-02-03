package algorithm.Tree;

public class TreeNode<Key, Value> {

    private Key key;
    private Value value;
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
}
