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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i],nums[i]);
        }
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode temp = head;
        while(temp!=null){
            if(!mpp.containsKey(temp.val)){
                t.next = temp;
                t = t.next;
            }
            temp = temp.next;
        }
        t.next = null;
        return dummy.next;
    }
}