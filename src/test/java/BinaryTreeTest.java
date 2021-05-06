import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
    @Test
    public void given3Nums_WhenAddedToBinaryTree_shouldReturnSizeThree() {
        NewBinaryTree<Integer> newBinaryTree = new NewBinaryTree<>();

        newBinaryTree.add(56);
        newBinaryTree.add(30);
        newBinaryTree.add(70);

        int size = newBinaryTree.getSize();

        Assertions.assertEquals(3,size);
    }
}
