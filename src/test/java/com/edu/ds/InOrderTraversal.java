package com.edu.ds;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    @Test
    public void verifyInOrderTraversal() {
        TreeNode r1 = new TreeNode(10);
        TreeNode r2 = new TreeNode(6);
        TreeNode r3 = new TreeNode(18);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(8);
        r1.setLeft(r2);
        r1.setRight(r3);
        r2.setLeft(r4);
        r2.setRight(r5);
        final List<Integer> integers = inOrderTraversal(r1);
        integers.forEach(System.out::println);
    }

    private List<Integer> inOrderTraversal(TreeNode root) {
        final List<Integer> lst = Lists.newArrayList();

        if (root == null) {
            return lst;
        }

        final Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;

        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode t = stack.pop();
                lst.add(t.val);
                p = t.right;
            }
        }
        return lst;
    }

    private class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int value) {
            val = value;
        }

        void setLeft(final TreeNode leftNode) {
            left = leftNode;
        }

        void setRight(final TreeNode rightNode) {
            right = rightNode;
        }
    }
}
