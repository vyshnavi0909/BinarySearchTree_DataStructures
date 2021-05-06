import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
    @Test
    public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree() {
        NewBinaryTree<Integer> newBinaryTree = new NewBinaryTree<>();

        newBinaryTree.add(56);
        newBinaryTree.add(30);
        newBinaryTree.add(70);

        int size = newBinaryTree.getSize();

        Assertions.assertEquals(3,size);
    }

    @Test
    public  void givenNumbers_WhenAddredToBinaryTree_ShouldReturnSize(){
        NewBinaryTree<Integer> newBinaryTree = new NewBinaryTree<>();

        newBinaryTree.add(56);
        newBinaryTree.add(30);
        newBinaryTree.add(70);
        newBinaryTree.add(22);
        newBinaryTree.add(40);
        newBinaryTree.add(60);
        newBinaryTree.add(95);
        newBinaryTree.add(11);
        newBinaryTree.add(65);
        newBinaryTree.add(3);
        newBinaryTree.add(16);
        newBinaryTree.add(63);
        newBinaryTree.add(67);

        int size = newBinaryTree.getSize();
        Assertions.assertEquals(13, size);
    }

    @Test
    public void givenANumberToSearch_WhenFound_ShouldReturnTrue(){
        NewBinaryTree<Integer> newBinaryTree = new NewBinaryTree<>();

        newBinaryTree.add(56);
        newBinaryTree.add(30);
        newBinaryTree.add(70);
        newBinaryTree.add(22);
        newBinaryTree.add(40);
        newBinaryTree.add(60);
        newBinaryTree.add(95);
        newBinaryTree.add(11);
        newBinaryTree.add(65);
        newBinaryTree.add(3);
        newBinaryTree.add(16);
        newBinaryTree.add(63);
        newBinaryTree.add(67);

        boolean result = newBinaryTree.searchNode(63);
        Assertions.assertTrue(result);
    }

}
