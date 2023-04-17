
public class AVLNode {
    private int data;
    private AVLNode leftChild;
    private AVLNode rightChild;
    private int height;

    public AVLNode(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
        this.height = 0;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public AVLNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(AVLNode leftChild) {
        this.leftChild = leftChild;
    }

    public AVLNode getRightChild(){
        return rightChild;
    }
    public void setRightChild(AVLNode rightChild) {
        this.rightChild = rightChild;
    }
    public  void setHeight(int height) {
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
}
