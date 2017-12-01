package com.yang.strt.binaryTree;

/**
 * @author yang
 * @version V1.0
 * @Description: TODO
 * @date ${date} ${time}
 */
public class TreeNode {
    private int key;
    private int val;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int key, int val) {
        this.key = key;
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
