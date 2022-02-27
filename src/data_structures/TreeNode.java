package data_structures;



public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        // Check for unwanted duplicate values
        if(value == data) {
            return;
        }
        // if value is less than this node, explore its left subtree
        if(value < data) {
            if(leftChild == null) {
                // if there is no value at this side, we've found our insertion point
                leftChild = new TreeNode(value);
            } else {
                // otherwise look at the left subtree
                leftChild.insert(value);
            }
            //if value is greater than this node, explore its right subtree
        } else {
            if (rightChild == null){
                // if there is no value at this side, we've found our insertion point
                rightChild = new TreeNode(value);
            } else {
                // otherwise we look at the right subtree
                rightChild.insert(value);
            }
        }


    }

    // IN-ORDER TRAVERSAL
    public void traverseInOrder() {
       if(leftChild != null) {
           leftChild.traverseInOrder();
       }
        System.out.print("Data = " + data + ", ");
       if(rightChild != null) {
           rightChild.traverseInOrder();
       }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
