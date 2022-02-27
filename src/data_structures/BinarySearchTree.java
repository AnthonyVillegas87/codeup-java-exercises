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
    }
}