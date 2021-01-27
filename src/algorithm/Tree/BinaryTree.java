package algorithm.Tree;

public class BinaryTree<Key extends Comparable<Key>, Value> {
    private TreeNode root;
    private int N;

    public int size(){
        return N;
    }

    //向树中添加元素key-value
    public void put(Key key, Value value){

    }

    //向指定的树x中添加key-value,并返回添加元素后新的树
    public TreeNode put(TreeNode x, Key key, Value value){
        return null;
    }

    //查询树中指定key对应的value
    public Value get(Key key){
        return null;
    }

    //从指定的树x中，查找key对应的值
    public Value get(TreeNode root, Key key){
        return null;
    }

    //删除树中key对应的value
    public void delete(Key key){

    }

    //删除指定树x中的key对应的value，并返回删除后的新树
    public TreeNode delete(TreeNode root, Key key){
        return null;
    }

}
