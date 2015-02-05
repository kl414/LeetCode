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
 * first implementation
 * too much duplicate codes
 */
/*
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
            
        ListNode head, pre, temp;
        
        if(l1.val > l2.val){
            head = new ListNode(l2.val);
            l2 = l2.next;
        }else{
            head = new ListNode(l1.val);
            l1 = l1.next;
        }
        pre = head;
                
        while(l1 != null || l2 != null){
            if(l1 == null){
                pre.next = l2;
                break;
            }else if(l2 == null){
                pre.next = l1;
                break;
            }
                
            if(l1.val > l2.val){
                temp = new ListNode(l2.val);
                l2 = l2.next;
            }else{
                temp = new ListNode(l1.val);
                l1 = l1.next;
            }
            pre.next = temp;
            pre = temp;
        }
        return head;
    }
}
*/

/**
 * recursive solution
 */
/*
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)  return l2;
        if(l2 == null)  return l1;
        
        ListNode head;
        if(l1.val > l2.val){
            head = new ListNode(l2.val);
            head.next = mergeTwoLists(l1, l2.next);
        }else{
            head = new ListNode(l1.val);
            head.next = mergeTwoLists(l1.next, l2);
        }
        
        return head;
    }
}
*/

/**
 * recursion will use a lot of stack space
 * so this is only use while loop to iterate
 * Also, this solution is not creating many new nodes which saves memory
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //just to put it so the compiler doesn't complain
        //the return will be head.next
        ListNode head = new ListNode(0);
        ListNode temp = head;
        
        while(l1 != null && l2 != null){
            boolean flag = l1.val < l2.val;
            temp.next = flag? l1 : l2;
            l1 = flag? l1.next : l1;
            l2 = flag? l2 : l2.next;
            temp = temp.next;
        }
        
        temp.next = l1 != null? l1 : l2;
        return head.next;
    }
}
