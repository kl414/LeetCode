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
  * I think below solution is more consise,
  * the other solution is to calculate the difference in length
  * then chop off the extra part and start scanning them one by one
  */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while(a != b){
            //Switch to the other list after reaching the end
            if(a != null){
                a = a.next;
            }else{
                a = headB;
            }
            
            if(b != null){
                b = b.next;
            }else{
                b = headA;
            }
        }
        
        return a;
    }
}
