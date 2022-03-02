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
                // other-wise look at the left subtree
                leftChild.insert(value);
            }
            //if value is greater than this node, explore its right subtree
        } else {
            if (rightChild == null){
                // if there is no value at this side, we've found our insertion point
                rightChild = new TreeNode(value);
            } else {
                // other-wise we look at the right subtree
                rightChild.insert(value);
            }
        }


    }

    public TreeNode get(int value) {
        if(value == data) {
            return this;
        }

        if(value < data) {
            if(leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if(rightChild != null) {
                return rightChild.get(value);
            }
        }

        return null;
    }

    public int min() {
        if(leftChild == null) {
            return data;
        } else {
            return leftChild.min();
        }
    }

    public int max() {
        if(rightChild == null) {
            return data;
        } else {
            return rightChild.max();
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

    // PRE-ORDER TRAVERSAL
    public void traversePreOrder() {

        System.out.print("Data = " + data + ", ");
        if(leftChild != null) {
            leftChild.traversePreOrder();
        }
        if(rightChild != null) {
            rightChild.traversePreOrder();
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
