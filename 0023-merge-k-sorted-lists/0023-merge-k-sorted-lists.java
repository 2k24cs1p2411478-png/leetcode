/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                result.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(result);
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for(int i=0;i<result.size();i++){
            temp.next = new ListNode(result.get(i));
            temp = temp.next;
        }
        return head.next;
    }
}