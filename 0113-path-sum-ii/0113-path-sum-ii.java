class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, new ArrayList<>(), targetSum, 0);
        return result;
    }
    public void dfs(TreeNode root, List<Integer> path, int targetSum, int sum) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        sum += root.val;
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                result.add(new ArrayList<>(path));
            }
        } else {
            dfs(root.left, path, targetSum, sum);
            dfs(root.right, path, targetSum, sum);
        }

        path.remove(path.size() - 1); 
    }
}