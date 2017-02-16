package com.edu.ds;

import org.junit.Test;

public class TreeMaxDepth {

    /*

    Height of a tree: Number fo edges in longest path from root to leaf node
    Height of tree = height of root node
    Height of tree with one node = 0

    Depth of a node: Number of edges in path from root to that node
    Depth of root node = 0
    Height of a tree = Max depth of any node in the tree
    Max Depth = Height of tree

     */

    @Test
    public void findMaxDepthOfBinaryTree() {
        final BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is: " + tree.maxDept(tree.root));
    }

    class Node {
        int data;
        Node left;
        Node right;

        Node(final int data) {
            this.data = data;
        }
    }

    class BinaryTree {
        Node root;

        int maxDept(final Node node) {
            if (node == null) {
                return 0;
            } else {
                int lDepth = maxDept(node.left);
                int rDepth = maxDept(node.right);

                if (lDepth > rDepth) {
                    return lDepth + 1;
                } else {
                    return rDepth + 1;
                }
            }
        }
    }

    @Test
    public void simpleRecursion() {
        recurse(5);
    }

    private void recurse(int n) {
        if (n > 0) {
            recurse(n - 1);
            System.out.println(n);
        }
    }
}

/*
main
   xMethod(5)
      xMethod(4)
          xMethod(3)
             xMethod(2)
                 xMethod(1)
                     xMethod(0)
                 print 1
             print 2
          print 3
      print 4
  print 5
 */