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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null)
         return -1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Long> sums = new ArrayList<>();
        while(!queue.isEmpty()){
            int size = queue.size();
            long sum =0;
            for(int i =0;i<size;i++){
                TreeNode curr = queue.poll();
                sum += curr.val;
                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);
            }
            sums.add(sum);
        }
        if(sums.size() < k)
            return -1;
        Collections.sort(sums);
        return sums.get(sums.size() - k);
        
    }
}