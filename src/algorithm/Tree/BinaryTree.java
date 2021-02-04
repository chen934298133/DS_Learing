package algorithm.Tree;

import algorithm.Linear_1.Queue_Code;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;

public class BinaryTree<Key extends Comparable<Key>, Value> {

    private TreeNode root;
    private int N;

    public int size(){
        return N;
    }

    // 向树中添加元素key-value
    public void put(Key key, Value value){
        root = put(root, key, value);
    }

    // 向指定的树x中添加key-value,并返回添加元素后新的树
    public TreeNode put(TreeNode x, Key key, Value value){
        // 递归出口
        // 如果树为空(或者依次寻找到叶子结点后，未找到也认作为空)
        // 则将此结点作为根节点使用
        if (x == null){
            N++;
            return new TreeNode(key, value, null, null);
        }

        // 如果x子树不为空,比较x结点的键和key的大小：
        int cmp = key.compareTo((Key) x.getKey());
        if (cmp > 0){
            // 如果key大于x结点的键，则继续找x结点的右子树
            x.right = put(x.right, key, value);
        }else if (cmp < 0){
            // 如果key小于x结点的键，则继续递归递归找x结点的左子树
            x.left = put(x.left,key,value);
        }else{
            // 如果key等于x结点的键，替换x结点的值为value即可
            x.setValue(value);
        }
        return x;
    }

    // 查询树中指定key对应的value
    public Value get(Key key){
        return get(root, key);
    }

    // 从指定的树x中，查找key对应的值
    public Value get(TreeNode x, Key key){
        // 与 put 思想相同
        if (x == null){
            return null;
        }

        int cmp = key.compareTo((Key) x.getKey());
        if (cmp > 0) {
            return get(x.right, key);
        }else if (cmp < 0){
            return get(x.left, key);
        }else {
            return (Value) x.getValue();
        }
    }

    // 删除树中key对应的value
    public TreeNode delete(Key key){
        return delete(root, key);
    }

    // 删除指定树x中的key对应的value，并返回删除后的新树
    // 删除方法有问题，等后面有空仔细改一下
    public TreeNode delete(TreeNode x, Key key){
        if (x == null){
            return null;
        }

        int cmp = key.compareTo((Key) x.getKey());
        if (cmp > 0){
            // 继续从下一个 x.right 寻找
            x.right = delete(x.right, key);
        }else if (cmp < 0){
            x.left = delete(x.left, key);
        }else {
            // 二叉树经典删除操作
            // 将需要删除的结点替换为左子树中最大的或者右子树中最小的

            N--;
            // 找右子树最小结点

            // 情形一: 右子树为空，返回左子树
            if (x.right==null){
                return x.left;
            }

            // 情形二： 左子树为空，返回右子树
            if (x.left==null){
                return x.right;
            }

            // 情形三： 左右子树都不为空
            // 就是在此处也可以实现寻找左子树中最大的结点，可以替换
            TreeNode minNode = x.right;     // 首先获取要删除节点的右子树的第一个结点
            while(minNode.left != null){
                // 循环找到右子树钟最小的结点
                minNode = minNode.left;
            }

            // 循环遍历删除最小的结点
            TreeNode node = x.right;
            while (node.left != null){
                if (node.left.left == null){
                    // 删除操作
                    node.left = node;
                }else {
                    node = node.left;
                }
            }

            // 更新刚刚找到的右子树的最小结点的左右子树 为 原来要删除的结点的左右子树

            minNode.left = x.left;
            minNode.right = x.right;
            // 原本父节点就是指向x的，所以直接更新x的信息即可
            x = minNode;
        }

        return x;
    }

    // 查找整个树中最小的键
    public Key min(){
        return (Key) min(root).getKey();
    }

    // 在指定树x中找出最小键所在的结点
    private TreeNode min(TreeNode x){

        //需要判断x还有没有左子结点，如果有，则继续向左找，如果没有，则x就是最小键所在的结点
        if (x.left!=null){
            return min(x.left);
        }else{
            return x;
        }
    }

    // 在整个树中找到最大的键
    public Key max(){
        return (Key) max(root).getKey();
    }

    // 在指定的树x中，找到最大的键所在的结点
    public TreeNode max(TreeNode x){
        //判断x还有没有右子结点，如果有，则继续向右查找，如果没有，则x就是最大键所在的结点
        if (x.right!=null){
            return max(x.right);
        }else{
            return x;
        }
    }

    // 前序遍历获取整个树中所有的键
    public Queue_Code<Key> preErgodic(){
        Queue_Code<Key> keys = Queue_Code.queue();
        preErgodic(root, keys);
        return keys;
    }

    // 递归获取指定树的所有键，并放在keys队列中
    private void preErgodic(TreeNode x, Queue_Code<Key> keys){
        if (x == null){
            return;
        }

        keys.add((Key) x.getKey());

        if (x.left != null){
            preErgodic(x.left, keys);
        }

        if (x.right != null){
            preErgodic(x.right, keys);
        }
    }

    // 中序遍历获取整个树中所有的键
    public Queue_Code<Key> midErgodic(){
        Queue_Code<Key> keys = Queue_Code.queue();
        midErgodic(root, keys);
        return keys;
    }

    // 递归获取指定树的所有键，并放在keys队列中
    private void midErgodic(TreeNode x, Queue_Code<Key> keys){
        if (x == null){
            return;
        }

        if (x.left != null){
            preErgodic(x.left, keys);
        }

        keys.add((Key) x.getKey());

        if (x.right != null){
            preErgodic(x.right, keys);
        }
    }

    // 后序遍历获取整个树中所有的键
    public Queue_Code<Key> afterErgodic(){
        Queue_Code<Key> keys = Queue_Code.queue();
        afterErgodic(root, keys);
        return keys;
    }

    // 递归获取指定树的所有键，并放在keys队列中
    private void afterErgodic(TreeNode x, Queue_Code<Key> keys){
        if (x == null){
            return;
        }

        if (x.left != null){
            preErgodic(x.left, keys);
        }

        if (x.right != null){
            preErgodic(x.right, keys);
        }

        keys.add((Key) x.getKey());
    }

    //使用层序遍历，获取整个树中所有的键
    public Queue_Code<Key> layerErgodic(){
        Queue_Code<Key> keys = Queue_Code.queue();
        Queue_Code<TreeNode> nodes = Queue_Code.queue();

        nodes.add(root);

        while ( !nodes.isEmpty()){
            TreeNode n = nodes.poll();
            keys.add((Key) n.getKey());
            if (n.left != null){
                nodes.add(n.left);
            }
            if (n.right != null){
                nodes.add(n.right);
            }
        }
        return keys;
    }

    //获取整个树的最大深度
    public int maxDepth(){
        return maxDepth(root);
    }


    //获取指定树x的最大深度
    private int maxDepth(TreeNode x){
        if (x == null){
            return 0;
        }

        //x的最大深度
        int max=0;

        //左子树的最大深度
        int maxL=0;

        //右子树的最大深度
        int maxR=0;

        //计算x结点左子树的最大深度
        if (x.left != null){
            maxL = maxDepth(x.left);
        }
        //计算x结点右子树的最大深度
        if (x.right != null){
            maxR = maxDepth(x.right);
        }

        //比较左子树最大深度和右子树最大深度，取较大值+1即可
        max = (maxL > maxR ? maxL+1 : maxR+1);

        return max;
    }
}
