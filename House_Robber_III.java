/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Brutal force solution is easy, but costly
 * adding Hashmap to store and reuse the information will have better performance
 * But best way is to use two ints to represent the amount of rob and not-rob
 */
public class Solution {
    public int rob(TreeNode root) {
        //0 is not-rob, 1 is rob
        int[] res = robSub(root);
        return Math.max(res[0], res[1]);
    }
    
    public int[] robSub(TreeNode root){
        if(root == null) return new int[2];
        
        int[] res = new int[2];
        int[] l = robSub(root.left);
        int[] r = robSub(root.right);
        //the checking is necessary since you can still choose whether to rob the children
        //even if you dont rob the current
        res[0] = Math.max(l[0] , l[1]) + Math.max(r[0], r[1]);
        res[1] = root.val + l[0] + r[0];
        
        return res;
    }
}
