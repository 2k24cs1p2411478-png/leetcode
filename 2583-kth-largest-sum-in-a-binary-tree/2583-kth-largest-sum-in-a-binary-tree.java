
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {

        if(root == null) return -1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        PriorityQueue<Long> pq = new PriorityQueue<>();

        while(!queue.isEmpty()) {

            int size = queue.size();
            long sum = 0;

            for(int i = 0; i < size; i++) {

                TreeNode curr = queue.poll();
                sum += curr.val;

                if(curr.left != null)
                    queue.offer(curr.left);

                if(curr.right != null)
                    queue.offer(curr.right);
            }

            pq.offer(sum);

            if(pq.size() > k)
                pq.poll();
        }

        if(pq.size() < k)
            return -1;

        return pq.peek();
    }
}
