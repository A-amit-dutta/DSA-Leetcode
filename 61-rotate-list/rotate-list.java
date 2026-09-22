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

    public static ListNode findNthNode(ListNode head , int cnt){
        ListNode temp = head;
        while(cnt>1){
            temp = temp.next;
            cnt--;
        }
        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {
        int n = 1;
        ListNode temp = head;
        
        if(head == null)
            return null;

        while(temp.next!=null){
            n++;
            temp = temp.next;
        }
        
        k = k % n;
        if( k % n == 0 )
            return head;
        temp.next = head;
        ListNode newNode = findNthNode(head,n-k);
        ListNode x = newNode.next;
        newNode.next =null;
        return x;

    }
}