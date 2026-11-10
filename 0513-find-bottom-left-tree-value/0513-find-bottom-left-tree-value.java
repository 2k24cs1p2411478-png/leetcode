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
    public int findBottomLeftValue(TreeNode root) {
        if(root == null)
            return -1;
        ArrayList<ArrayList<Integer>> order = new ArrayList<>();
        Queue<TreeNode>  queue = new LinkedList<>();
        queue.add(root);
       while(!queue.isEmpty()){
            int levelnum = queue.size();
            ArrayList<Integer> sublist = new ArrayList<>() ;
            for(int i=0;i<levelnum;i++){
                if(queue.peek().left != null)
                queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                queue.offer(queue.peek().right);
                sublist.add(queue.poll().val);
            }
            order.add(sublist);

     }
            return order.get(order.size()- 1).get(0);
    }
}