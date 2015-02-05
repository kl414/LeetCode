/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Idea
 * keep putting the middle element of the array as root
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        
        TreeNode head = balancedBST(num, 0, num.length-1);
        return head;
    }
    
    public TreeNode balancedBST(int[] num, int low, int high){
        //base case
        if(low > high)
            return null;
        
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = balancedBST(num, low, mid-1);
        node.right = balancedBST(num, mid+1, high);
        
        return node;
    }
}
