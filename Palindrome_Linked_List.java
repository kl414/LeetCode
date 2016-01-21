/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * use two pointers to find the mid point and last point
 * reverse the later half and then compare
 * reverse the later half back
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
            
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null) slow = slow.next;
        
        slow = reverse(slow);
        //use fast to recover
        fast = slow;
        
        while(slow != null){
            if(head.val != slow.val){
                reverse(fast);
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        reverse(fast);
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
