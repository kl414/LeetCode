/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * The problem is pointless in a way that this is not really one pass
 * the number of nodes visited is length * 2 - n
 * which is same as loop through all the element once to find length
 * and second loop to find the length - n element
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0) return head;
        
        ListNode p1 = head;
        ListNode p2 = head;
        
        while(n > 0){
            p1 = p1.next;
            n--;
        }
        
        //remove first element
        if(p1 == null){
            head = head.next;
        }else{
            //regular case
            while(p1.next != null){
                p1 = p1.next;
                p2 = p2.next;
            }
            p2.next = p2.next.next;
        }
        return head;
    }
}
