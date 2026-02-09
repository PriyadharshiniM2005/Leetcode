// Last updated: 2/9/2026, 4:10:01 PM
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
    public ListNode middleNode(ListNode head) {
          ListNode t1=head,t2=head;
          while(t2!=null && t2.next!=null){
            t1=t1.next;
            t2=t2.next.next;
          }
          return t1;
    }
}