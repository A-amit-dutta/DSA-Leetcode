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

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public ListNode removeNodes(ListNode head) {
        if (head.next == null)
            return head;
        // Reverse the list
        head = reverse(head);

        int maxVal = head.val;
        ListNode prev = head;
        ListNode current = head.next;
        ListNode mover = head;

        while (current != null) {
            if (current.val < maxVal) {
                prev.next = current.next;
            }
            else{
                maxVal = current.val;
                prev = current;
            }
            current = current.next;
        }
        head = reverse(head);
        return head;
    }
}