package dsa.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    TreeNode root;

    public BinaryTree(){
        this.root = null;
    }
    private List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root){
        ans.clear();
        inTraverse(root);
        return ans;
    }
    public void inTraverse(TreeNode curr){
        if(curr==null) return;
        inTraverse(curr.left);
        ans.add(curr.val);
        inTraverse(curr.right);
    }

    // Preorder traversal method
    public List<Integer> preorderTraversal(TreeNode root) {
        ans.clear();          // important if method is called multiple times
        preTraverse(root);
        return ans;
    }

    // Helper recursive method
    private void preTraverse(TreeNode curr) {
        if (curr == null) {
            return;
        }
        ans.add(curr.val);        // root
        preTraverse(curr.left);      // left
        preTraverse(curr.right);     // right
    }
    // Main method
    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTree tree = new BinaryTree();
        List<Integer> preOrderResult = tree.preorderTraversal(root);

        System.out.println("Preorder Traversal: " + preOrderResult);

        List<Integer> inOrderResult = tree.inorderTraversal(root);

        System.out.println("Inorder Traversal: " + inOrderResult);
    }
}
