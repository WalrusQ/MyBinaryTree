import org.junit.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

import static org.junit.Assert.*;


public class BinaryTreeTest {

        @Test
        public void testRemove() {
            BinaryTree<Integer> tree = new BinaryTree<>();
            tree.add(15);
            tree.add(10);
            tree.add(11);
            tree.add(8);
            tree.add(7);
            tree.add(9);
            tree.add(16);
            tree.add(20);
            tree.add(18);
            tree.add(17);
            assertEquals(tree.contains(15), TRUE);
            assertEquals(tree.contains(10), TRUE);
            assertEquals(tree.contains(11), TRUE);
            assertEquals(tree.contains(8), TRUE);
            assertEquals(tree.contains(7), TRUE);
            assertEquals(tree.contains(9), TRUE);
            assertEquals(tree.contains(16), TRUE);
            assertEquals(tree.contains(20), TRUE);
            assertEquals(tree.contains(18), TRUE);
            assertEquals(tree.contains(17), TRUE);
            tree.remove(8);
            assertEquals(tree.contains(15), TRUE);
            assertEquals(tree.contains(10), TRUE);
            assertEquals(tree.contains(11), TRUE);
            assertEquals(tree.contains(8), FALSE);
            assertEquals(tree.contains(7), FALSE);
            assertEquals(tree.contains(9), FALSE);
            assertEquals(tree.contains(16), TRUE);
            assertEquals(tree.contains(20), TRUE);
            assertEquals(tree.contains(18), TRUE);
            assertEquals(tree.contains(17), TRUE);
        }
}