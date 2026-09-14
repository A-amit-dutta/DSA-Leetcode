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
    public static ListNode rev(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode front = temp.next; // save next node
            temp.next = prev; // reverse the link
            prev = temp; // move prev forward
            temp = front; // move temp forward
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = rev(slow.next);
        ListNode first = head, second = newHead;
        while (second != null) {
            if (first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        rev(newHead);
        return true;
    }
}