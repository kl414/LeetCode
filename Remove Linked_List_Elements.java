/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //can also use ListNode fakeHead = new ListNode(-1); to avoid the checking
        //or return head.val == val ? head.next : head; to avoid
        while(head != null && head.val == val)
            head = head.next;
            
        if(head == null) return null;
        ListNode pre = head;
        ListNode curr = head.next;
        
        while(curr != null){
            if(curr.val == val){
                pre.next = curr.next;
            }else{
                pre = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}

//recursive method
/*
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode next = removeElements(head.next, val);
        if(head.val == val) return next;
        head.next = next;
        return head;
    }
}
*/
