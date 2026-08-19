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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        
        n = cnt - n + 1;
        if (head == null)
            return head;
        if (n == 1) {
            ListNode t = head;
            return head.next;
        }
        
        cnt = 0;
        temp = head;
        ListNode prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == n) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}