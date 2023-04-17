
public class AVLTree {
    private AVLNode root;

    public AVLTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int data) {
        root = insert(data, root);
    }

    private AVLNode insert(int data, AVLNode node) {
        if (node == null) {
            node = new AVLNode(data);
        } else if (data < node.getData()) {
            node.setLeftChild(insert(data, node.getLeftChild()));
        } else if (data > node.getData()) {
            node.setRightChild(insert(data, node.getRightChild()));
        }

        node.setHeight(Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild())) + 1);

        int balance = getBalance(node);

        if (balance > 1 && data < node.getLeftChild().getData()) {
            return rotateRight(node);
        }

        if (balance < -1 && data > node.getRightChild().getData()) {
            return rotateLeft(node);
        }

        if (balance > 1 && data > node.getLeftChild().getData()) {
            node.setLeftChild(rotateLeft(node.getLeftChild()));
            return rotateRight(node);
        }

        if (balance < -1 && data < node.getRightChild().getData()) {
            node.setRightChild(rotateRight(node.getRightChild()));
            return rotateLeft(node);
        }

        return node;
    }

    private AVLNode rotateRight(AVLNode node) {
        AVLNode temp = node.getLeftChild();
        node.setLeftChild(temp.getRightChild());
        temp.setRightChild(node);
        node.setHeight(Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild())) + 1);
        temp.setHeight(Math.max(getHeight(temp.getLeftChild()), getHeight(temp.getRightChild())) + 1);
        return temp;
    }

    private AVLNode rotateLeft(AVLNode node) {
        AVLNode temp = node.getRightChild();
        node.setRightChild(temp.getLeftChild());
        temp.setLeftChild(node);
        node.setHeight(Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild())) + 1);
        temp.setHeight(Math.max(getHeight(temp.getLeftChild()), getHeight(temp.getRightChild())) + 1);
        return temp;
    }

    private int getHeight(AVLNode node) {
        if (node == null) {
            return -1;
        } else {
            return node.getHeight();
        }
    }

    private int getBalance(AVLNode node) {
        if (node == null) {
            return 0;
        } else {
            return getHeight(node.getLeftChild()) - getHeight(node.getRightChild());
        }
    }

    public void display() {
        display(root);
    }

    private void display(AVLNode node) {
        if (node != null) {
            display(node.getLeftChild());
            System.out.print(node.getData() + " ");
            display(node.getRightChild());
        }
    }
}
