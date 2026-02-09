// Last updated: 2/9/2026, 4:11:01 PM
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
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode d = new ListNode(0); 
        ListNode cur = head;
        while (cur != null) {
            ListNode prev = d;
            while (prev.next != null && prev.next.val < cur.val) {
                prev = prev.next;
            }
            ListNode nextTemp = cur.next;
            cur.next = prev.next;
            prev.next = cur;
            cur = nextTemp;
        }
        return d.next;
    }
}
