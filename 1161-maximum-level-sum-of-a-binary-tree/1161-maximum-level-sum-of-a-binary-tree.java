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
    public int maxLevelSum(TreeNode root) {
        if(root == null)
            return 0;
        int level =1;
        int maxlevel = 1;
        int maxsum = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
       
        queue.add(root);
        while(!queue.isEmpty()){
            int sum =0;
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode curr = queue.poll();
                sum += curr.val;
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            }
            if(sum > maxsum){
                maxsum = sum;
                maxlevel = level;
            }
            level++;
           
        }
        return maxlevel;
        
    }
}