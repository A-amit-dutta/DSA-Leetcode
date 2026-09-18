/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        Map<ListNode,ListNode> mpp = new HashMap<>();
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp1!=null){
            mpp.put(temp1,temp1);
            temp1 = temp1.next;
        }

        while(temp2!=null){
            if(mpp.containsKey(temp2)){
                return temp2;
            }
            // mpp.put(temp1,temp1);
            temp2 = temp2.next;
        }
        return null;
    }
}