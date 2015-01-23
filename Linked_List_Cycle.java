/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
/**
 * use one more pointer to iterate through the LL
 * check if the two pointers point to same address again
 */ 
/**
 * The following code should work
 * but exceed the runtime limit
 * so I'm going to try other ways
 */
 /*
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode temp = head.next;
        while(temp != null){
            if(temp == head)
                return true;
            temp = temp.next;
        }
        return false;
    }
}
*/

/** use two pointers, slow and fast
 * on each iteration, slow moves one step and fast moves two steps
 * check if they ever point to the same address
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        
        return false;
    }
}
