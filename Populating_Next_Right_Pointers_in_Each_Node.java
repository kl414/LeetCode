/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */

/**
 * This is a recursive solution
 * which uses extra stack space
 * I implemented it just for the purpose of practicing
 */
/*
public class Solution {
    public void connect(TreeLinkNode root) {
        //base case
        if(root == null || root.left == null) return;
        
        TreeLinkNode left = root.left;
        TreeLinkNode right = root.right;
        
        left.next = right;
        
        while(left.right != null){
            left.right.next = right.left;
            left = left.right;
            right = right.left;
        }
        
        connect(root.left);
        connect(root.right);
        
        return;
    }
}
*/

/**
 * Iterative solution
 * which does not use extra space
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        
        TreeLinkNode prev = root;
        TreeLinkNode curr;
        
        while(prev.left != null){
            curr = prev;
            while(curr != null){
                if(curr.left != null) 
                    curr.left.next = curr.right;
                if(curr.right != null && curr.next != null)
                    curr.right.next = curr.next.left;
                curr = curr.next;
            }
            prev = prev.left;
        }
    }
}
