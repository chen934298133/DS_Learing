package algorithm.Tree;

public class BinaryTreeTest {
    public static void main(String[] args){
        BinaryTree<Integer,Integer> tree1 = new BinaryTree();
        tree1.put(2,2);
        tree1.put(1,1);
        tree1.put(4,4);
        tree1.put(3,3);
        tree1.put(0,0);
        System.out.println(tree1.get(0));
        System.out.println(tree1.size());
        System.out.println(tree1.delete(3).getKey());

//        System.out.println(tree1.get(2));
//        tree1.put(tree1,2,2.2);


    }
}
