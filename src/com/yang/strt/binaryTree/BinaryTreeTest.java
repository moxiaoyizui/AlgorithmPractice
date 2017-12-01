package com.yang.strt.binaryTree;

import sun.reflect.generics.tree.Tree;

/**
 * @author yang
 * @version V1.0
 * @Description: TODO
 * @date ${date} ${time}
 */
public class BinaryTreeTest {

    private TreeNode rnode;

    public TreeNode getRnode() {
        return rnode;
    }

    public void setRnode(TreeNode rnode) {
        this.rnode = rnode;
    }

    public TreeNode find(int key) {
        TreeNode tempNode = rnode;

        while (tempNode != null && key != tempNode.getKey()) {
            if (key < tempNode.getKey()) {
                tempNode = tempNode.getLeftNode();
            } else {
                tempNode = tempNode.getRightNode();
            }
        }

        return tempNode;
    }

    public boolean addNode(TreeNode node) {

        if (rnode == null) {
            rnode = node;
            return true;
        }

        TreeNode tnode = rnode;
        boolean isLeft = false;
        TreeNode pnode = rnode;

        while (tnode != null) {
            pnode = tnode;
            if (node.getKey() < tnode.getKey()) {
                tnode = tnode.getLeftNode();
                isLeft = true;
            } else if (node.getKey() >= tnode.getKey()) {
                tnode = tnode.getRightNode();
                isLeft = false;
            } else if (node.getKey() == tnode.getKey()) {
                tnode.setVal(node.getVal());
                return true;
            }
        }

        if (isLeft) {
            pnode.setLeftNode(node);
        } else {
            pnode.setRightNode(node);
        }

        return true;
    }

    public boolean del(int key) {
        TreeNode tarnode = find(key);

        if (tarnode == null) {
            System.out.println("No such node, key:" + key);
            return true;
        }

        if (tarnode.getLeftNode() == null && tarnode.getRightNode() == null) {

        } else if (tarnode.getLeftNode() == null || tarnode.getRightNode() == null) {

        } else if (tarnode.getLeftNode() != null && tarnode.getRightNode() != null) {

        }

        return true;
    }

    public void preOrder(TreeNode rootNode) {
        if (rootNode != null) {
            System.out.println("key:" + rootNode.getKey() + ", val:" + rootNode.getVal());
            preOrder(rootNode.getLeftNode());
            preOrder(rootNode.getRightNode());
        }
    }

    public void inOrder(TreeNode rootNode) {
        if (rootNode != null) {
            inOrder(rootNode.getLeftNode());
            System.out.println("key:" + rootNode.getKey() + ", val:" + rootNode.getVal());
            inOrder(rootNode.getRightNode());
        }
    }

    public void postOrder(TreeNode rootNode) {
        if (rootNode != null) {
            postOrder(rootNode.getLeftNode());
            postOrder(rootNode.getRightNode());
            System.out.println("key:" + rootNode.getKey() + ", val:" + rootNode.getVal());
        }
    }
}
