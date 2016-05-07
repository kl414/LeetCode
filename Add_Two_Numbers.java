/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode pre = new ListNode(0);
        ListNode res = pre;
        while(l1 != null || l2 != null || carry != 0){
            int sum = (l1 != null? l1.val:0) + (l2 != null? l2.val:0) + carry;
            carry = sum / 10;
            pre.next = new ListNode(sum % 10);
            pre = pre.next;
            
            l1 = (l1 != null)? l1.next : null;
            l2 = (l2 != null)? l2.next : null;
        }
        
        return res.next;
    }
}
