package algorithm.Hash_2;

public class Test{
    public static void main(String[] args){
        HashTable_Code<Integer, String> hashtable = HashTable_Code.hashTable_code();
        hashtable.put(1,"one");
        hashtable.put(2,"two");
        hashtable.put(3,"three");
        hashtable.put(4,"four");

        System.out.println(hashtable.size());
        System.out.println(hashtable.get(2));
        // 要想在此处使用Integer、String等重点在于继承Iterable时也要带上泛型
        for (Integer key: hashtable) {
            System.out.println(key);
        }

        hashtable.delete(3);

        // 要想在此处使用Integer、String等重点在于继承Iterable时也要带上泛型
        for (Integer key: hashtable) {
            System.out.println(key);
        }
        System.out.println(hashtable.size());
        System.out.println(hashtable.get(10));


        // ========================================================

        OrderHashTable_Code h1 = OrderHashTable_Code.hashTable_code();
        h1.put(1,"1");
        h1.put(2,"2");
        h1.put(3,"3");
        System.out.println(h1.size());
        h1.delete(1);
        System.out.println(h1.size());
        System.out.println(h1.get(1));
    }
}
