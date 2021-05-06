public class NewBinaryTree<K extends Comparable<K>> {
    private BinaryNode<K> root;

    public void add(K key){
        this.root = this.addRecursively(root, key);
    }

    private BinaryNode<K> addRecursively(BinaryNode<K> currentNode, K key){
        if (currentNode == null){
            return new BinaryNode<>(key);
        }
        int compareRes = key.compareTo(currentNode.key);
        if (compareRes == 0){
            return currentNode;
        }if (compareRes < 0){
            currentNode.left = addRecursively(currentNode.left, key);
        }else {
            currentNode.right = addRecursively(currentNode.right, key);
        }
        return currentNode;
    }

    public int getSize(){
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(BinaryNode<K> currentNode){
        return currentNode == null ? 0 : 1 + this.getSizeRecursive(currentNode.left)
                                            + this.getSizeRecursive(currentNode.right);
    }
}
