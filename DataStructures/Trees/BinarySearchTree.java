class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        this.root = null;
    }

    void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null)
            return new TreeNode(value);

        if (value <= node.value)
            node.left = insertRecursive(node.left, value);
        else
            node.right = insertRecursive(node.right, value);

        return node;
    }

    TreeNode inOrderSuccessor(TreeNode node) {
        TreeNode current = node;
        while (current != null && current.left != null)
            current = current.left;

        return current;
    }

    TreeNode inOrderPredecessor(TreeNode node) {
        TreeNode current = node;
        while (current != null && current.right != null)
            current = current.right;

        return current;
    }

    void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private TreeNode deleteRecursive(TreeNode node, int value) {
        if (node == null)
            return null;

        if (value < node.value)
            node.left = deleteRecursive(node.left, value);
        else if (value > node.value)
            node.right = deleteRecursive(node.right, value);
        else {
            if (node.left == null)
                return node.right;
            if (node.right == null)
                return node.left;

            // TreeNode successor = inOrderSuccessor(node.right);
            // node.value = successor.value;
            // node.right = deleteRecursive(node.right, successor.value);

            TreeNode predecessor = inOrderPredecessor(node.left);
            node.value = predecessor.value;
            node.left = deleteRecursive(node.left, predecessor.value);
        }
        return node;
    }

    void preOrderTraversal() {
        preOrderTraversal(root);
        System.out.println();
    }

    private void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + "\t");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + "\t");
            inOrderTraversal(node.right);
        }
    }

    void postOrderTraversal() {
        postOrderTraversal(root);
        System.out.println();
    }

    private void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + "\t");
        }
    }
}