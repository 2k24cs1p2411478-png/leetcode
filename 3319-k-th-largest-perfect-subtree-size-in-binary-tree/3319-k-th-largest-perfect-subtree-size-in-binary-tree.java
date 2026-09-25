class Solution {
    ArrayList<Integer> Ans = new ArrayList<>();

    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        solve(root);
        Collections.sort(Ans);

        if (Ans.size() < k)
            return -1;

        return Ans.get(Ans.size() - k);
    }

    public boolean solve(TreeNode root) {
        if (root == null)
            return true;

        int[] left = isperfect(root.left);
        int[] right = isperfect(root.right);

        int leftHeight = left[0];
        int rightHeight = right[0];

        boolean leftPerfect = left[1] == 1;
        boolean rightPerfect = right[1] == 1;

        if (leftHeight == rightHeight &&
            leftPerfect && rightPerfect) {

            int h = leftHeight + 1;
            int size = (1 << h) - 1;

            Ans.add(size);

            return true;
        }

        return false;
    }

    public int[] isperfect(TreeNode root) {
        if (root == null)
            return new int[]{0, 1};

        int[] left = isperfect(root.left);
        int[] right = isperfect(root.right);

        int leftHeight = left[0];
        int rightHeight = right[0];

        boolean leftPerfect = left[1] == 1;
        boolean rightPerfect = right[1] == 1;

        if (leftHeight == rightHeight &&
            leftPerfect && rightPerfect) {

            int h = leftHeight + 1;

            int size = (1 << h) - 1;
            Ans.add(size);

            return new int[]{h, 1};
        }

        return new int[]{
            Math.max(leftHeight, rightHeight) + 1, 0
        };
    }
}