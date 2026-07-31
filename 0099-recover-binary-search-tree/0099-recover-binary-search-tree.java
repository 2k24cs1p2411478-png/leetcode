/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        ArrayList<TreeNode> nodes = new ArrayList<>();
        inorder(root, nodes);
        TreeNode first = null;
        TreeNode second = null;
        for (int i = 0; i < nodes.size() - 1; i++) {
            if (nodes.get(i).val > nodes.get(i + 1).val) {
                if (first == null) {
                    first = nodes.get(i);
                }
                second = nodes.get(i + 1);
            }
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void inorder(TreeNode root, ArrayList<TreeNode> nodes) {
        if (root == null) {
            return;
        }
        inorder(root.left, nodes);
        nodes.add(root);
        inorder(root.right, nodes);
    }
}