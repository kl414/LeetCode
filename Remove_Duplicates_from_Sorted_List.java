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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        
        ListNode prev = head;
        ListNode curr = head;
        
        while(curr.next != null){
            curr = curr.next;
            if(prev.val == curr.val){
                prev.next = curr.next;
                continue;
            }
            prev =  prev.next;
        }
        
        return head;
    }
}
