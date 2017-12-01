package com.yang.main;

import com.yang.strt.binaryTree.BinaryTreeTest;
import com.yang.strt.binaryTree.TreeNode;

/**
 * @author yang
 * @version V1.0
 * @Description: TODO
 * @date ${date} ${time}
 */
public class BinaryTreeLauncher {
    public static void main(String[] args){
        BinaryTreeTest tree = new BinaryTreeTest();
        tree.addNode(new TreeNode(6,6));
        tree.addNode(new TreeNode(12,12));
        tree.addNode(new TreeNode(3,3));
        tree.addNode(new TreeNode(4,4));
        tree.addNode(new TreeNode(1,1));
        tree.addNode(new TreeNode(7,7));
        tree.addNode(new TreeNode(8,8));
        tree.addNode(new TreeNode(85,85));
        tree.addNode(new TreeNode(-3,-3));
        tree.addNode(new TreeNode(6,7));
        System.out.println("inOrder");
        tree.inOrder(tree.getRnode());

        System.out.println("preOrder");
        tree.preOrder(tree.getRnode());

        System.out.println("postOrder");
        tree.postOrder(tree.getRnode());
    }
}
