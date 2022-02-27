package data_structures;

import algorithms.BinarySearch;

public class BinarySearchTree {

    //Binary Search Tree

    private TreeNode root;

    /*
    * Can perform insertions, deletions, and retrievals in O(log(N)) time
    * The left child always has a smaller value than it's parent
    * The right child always has a larger value than it's parent
    * This means everything to the left of the root is less than the value of the root, and everything to the right of the root is greater than the value of the root
    * Because of that, we can do a binary search
     */

    /*
    * Hierarchical data structure
    * Every item in the tree is a node
    * The node at the top of the tree is the root
    * Every non-root node has one and only one parent
    * A leaf node has no children
    * A singleton tree has only one node - the root
     */

    public void insert(int value) {
        //if there is no root we will then create one
        if(root == null) {
            root = new TreeNode(value);
        } else {
            // if there is a value, we compare and insert where necessary
            root.insert(value);
        }
    }

    /*
    * Traversal (4 ways)
    * LEVEL - visit nodes on each level ------- NOT USED OFTEN
    * PRE-ORDER - visit the root of every subtree first
    * POST-ORDER - visit the root of every subtree last
    * IN-ORDER - visit left child, then root, then right child ------ FASTER THAN MOST SORTING ALGORITHMS
     */

    public void traversInOrder() {
        if(root != null) {
            root.traverseInOrder();
        }
    }



    public void traversPreOrder() {
        if(root != null) {
            root.traversePreOrder();
        }
    }
    //DELETE Cases
    /*
    * Node is a leaf
    * Node has one child
    * Node has two children
     */

    public void delete(int value) {
       root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if(subTreeRoot == null) {
            return subTreeRoot;
        }

        if(value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if(value > subTreeRoot.getData()) {
           subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            // Cases 1 & 2: node to delete has 0 or 1 child(ren)
            if(subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            } else if(subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }
            //Case 3: node has two children

            //=== Replace the value int the right subtreeRoot node w/ the smallest value from the right subtree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            //=== Delete the node that has the smallest value in the right subtree
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }
        return subTreeRoot;


    }

    /*
    * ========== Deletion of a Node w/ TWO children
    * Need to figure out what the replacement node will be
    * Want to find the minimal disruption to the existing tree structure
    * Can take the replacement node from the deleted node's left subtree or right subtree
    * If taking it from the left subtree, we have to take the largest value in the left subtree
    * If taking it from the right subtree, we have to take the smallest value in the right subtree
    * Choose one and stick to it!!
     */


    public TreeNode get(int value) {
        if(root != null) {
            return root.get(value);
        }

        return null;
    }

    public int min() {
        if(root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if(root == null) {
           return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.traversInOrder();
        System.out.println();

//        System.out.println(tree.get(27));
//        System.out.println(tree.get(32));
//        System.out.println(tree.get(888));
//
//        System.out.println(tree.min());
//        System.out.println(tree.max());

        tree.delete(15);

        tree.traversInOrder();
        System.out.println();

    }
}
