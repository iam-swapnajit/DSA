package dsa.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    TreeNode root;

    public BinaryTree(){
        this.root = null;
    }
    private List<Integer> ans = new ArrayList<>();

    // Preorder traversal method
    public List<Integer> preorderTraversal(TreeNode root) {
        ans.clear();          // important if method is called multiple times
        traverse(root);
        return ans;
    }

    // Helper recursive method
    private void traverse(TreeNode curr) {
        if (curr == null) {
            return;
        }
        ans.add(curr.val);        // root
        traverse(curr.left);      // left
        traverse(curr.right);     // right
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
        List<Integer> result = tree.preorderTraversal(root);

        System.out.println("Preorder Traversal: " + result);
    }
}
