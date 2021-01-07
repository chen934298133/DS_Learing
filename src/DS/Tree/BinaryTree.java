package DS.Tree;

public class BinaryTree<Key extends Comparable<Key>,Value> {
    private Node root;

    private int N;

    private class Node{
        public Key key;
        private Value value;
        public Node left;
        public Node right;

        public Node (Key key, Value value, Node left, Node right){
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public int size(){
        return N;
    }

    public void put(Key key, Value value){
        root = put(root, key,value);
    }

    private Node put(Node x, Key key, Value value){
        if (x == null) {
            N++;
            return new Node (key , value , null ,null);
        }

        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            //继续向右寻找x解点的右子树
            x.right = put(x.right,key ,value);
        } else if (cmp < 0) {
            x.left = put(x.left , key , value);
        }else {
            x.value = value;
        }
        return x;
    }

    //查询书中指定key值对应得value
    public Value get(Key key){
        return get(root,key);
    }

    //从指定的树x中，查找key对应的值
    public Value get(Node x, Key key){
        //x树为null
        if (x == null) {
            return null;
        }

        //x树不为null
        //比较key和x结点的键的大小
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            return get(x.right,key);
        } else if (cmp < 0) {
            return get(x.left,key);
        } else {
          return x.value;
        }
    }

    //删除树中key对应的value
    public void delete(Key key){
        delete(root , key);
    }

    //删除指定树x中的key对应的value，并返回删除后的新树
    public Node delete (Node x, Key key){
        //x树为null
        if (x == null) {
            return null;
        }

        //x树不为null
        int cmp = key.compareTo(x.key);
        if (cmp > 0){
            //如果key大于x结点的键，则继续找x结点的右子树
            x.right = delete(x.right,key);
        }else if(cmp < 0 ){
            //如果key小于x结点的键，则继续找x结点的左子树
            x.left = delete(x.left , key);
        }else {
            //如果key等于x结点的键，完成真正的删除结点动作，要删除的结点就是x；
            //让元素个数-1
            N--;

            //找到右子树中最小的结点
            if(x.right == null){
                return x.left;
            }
            if(x.left == null){
                return x.right;
            }

            Node minNode = x.right;
            while(minNode.left != null){
                minNode = minNode.left;
            }

            //删除右子树中最小的结点
            Node n =x.right;
            while (n.left != null) {
                if(n.left.left == null){
                    n.left = null;
                }else {
                    //exchange the node
                    n = n.left;
                }
            }
            //让x结点的左子树成为minNode的左子树
            minNode.left = x.left;
            //让x结点的右子树成为minNode的右子树
            minNode.right = x.right;
            //让x结点的父结点指向minNode
            x = minNode;
        }
        return x;
    }
}
