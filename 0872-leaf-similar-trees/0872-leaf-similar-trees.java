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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       ArrayList<Integer> leaves1 = new ArrayList<>();
       ArrayList<Integer> leaves2 = new ArrayList<>();
       leaveslist(root1,leaves1);
       leaveslist(root2,leaves2);
       return leaves1.equals(leaves2);
    }
    public void leaveslist(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;

        }
        leaveslist(root.left,list);
        leaveslist(root.right,list);
    }
}