package algorithm.Tree.Test;

import algorithm.Tree.BinaryTree;

import java.util.Iterator;

/**
 *      2
 *    1  4
 *   0  3
 *
 * preErgodic: 2 1 0 4 3
 * midErgodic: 1 0 2 4 3
 * afterErgodic: 1 0 4 3 2    // 0 1 3 4 2 ????
 * layerErgodic: 2 1 4 0 3
 */
public class ergodicTest {
    public static void main(String[] args){
        BinaryTree<Integer, Integer> ergodic = new BinaryTree();

        ergodic.put(2,2);
        ergodic.put(1,1);
        ergodic.put(4,4);
        ergodic.put(3,3);
        ergodic.put(0,0);

        Iterator preIterator = ergodic.preErgodic().iterator();
        Iterator midIterator = ergodic.midErgodic().iterator();
        Iterator afterIterator = ergodic.afterErgodic().iterator();
        Iterator layerIterator = ergodic.layerErgodic().iterator();

        System.out.print("preErgodic: ");
        while (preIterator.hasNext()){
            System.out.print(preIterator.next() + " ");
        }
        System.out.println();

        System.out.print("midErgodic: ");
        while (midIterator.hasNext()){
            System.out.print(midIterator.next() + " ");
        }

        System.out.println();
        System.out.print("afterErgodic: ");
        while (afterIterator.hasNext()){
            System.out.print(afterIterator.next() + " ");
        }

        System.out.println();
        System.out.print("layerErgodic: ");
        while (layerIterator.hasNext()){
            System.out.print(layerIterator.next() + " ");
        }
    }
}
