package DS.Tree;

public class BinaryTree_Test {
    public static void main(String[] args){
        BinaryTree<Integer, String> t1 = new BinaryTree();
        t1.put(1,"chen");
        t1.put(2,"jia");
        t1.put(3,"sheng");
        System.out.println(t1.get(1));
//        while(t1 != null){
//            System.out.println(t1);
//        }
    }
}
