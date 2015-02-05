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
/**
 * can also use a fake head to pointing to the head
 * avoiding some of the codes that deal with head as special case
 */
/*
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode pre = head;
        ListNode first = head;
        ListNode second = head.next;
        
        while(true){
            first.next = second.next;
            second.next = first;
            if(pre == head){
                head = second;
            }else{
                pre.next = second;
            }
            pre = first;
            
            if(pre.next == null || pre.next.next == null){
                break;
            }else{
                first = pre.next;
                second = pre.next.next;
            }
        }
        
        return head;
    }
}
*/
/**
 * Although using recursion violates the requirements
 * but it's still a good way to practice
 * also recursion's code is much cleaner
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
            
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
        
    }
} 
