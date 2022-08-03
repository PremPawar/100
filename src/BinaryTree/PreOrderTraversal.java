package BinaryTree;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

public class PreOrderTraversal {
    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode (int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);


        root = first;   //root ----> first
        first.left = second;
        first.right = third; //second <---- root -----> first
        second.left = fourth;
    }

    //Recursive way of preOrder traversal
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    //Iterative way of preOrder traversal
    public void preOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args){
        PreOrderTraversal pt = new PreOrderTraversal();
        pt.createBinaryTree();
//        pt.preOrder(pt.root);
        pt.preOrder();
    }
}
