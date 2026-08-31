class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        ArrayList<Integer> critical = new ArrayList<>();
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i - 1) &&
                list.get(i) < list.get(i + 1)) { 
                critical.add(i);
            }
            if (list.get(i) > list.get(i - 1) &&
                list.get(i) > list.get(i + 1)) {
                critical.add(i);
            }
        }
        if (critical.size() < 2) {
            return new int[]{-1, -1};
        }
        maxDistance = critical.get(critical.size() - 1) - critical.get(0);
        for (int i = 1; i < critical.size(); i++) {
            int diff = critical.get(i) - critical.get(i - 1);
            minDistance = Math.min(minDistance, diff);
        }
        return new int[]{minDistance, maxDistance};
    }
}