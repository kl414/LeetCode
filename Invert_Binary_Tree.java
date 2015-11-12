/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        /**
         * DNF solution
         */
         /*
         if(root == null) return null;
         
         TreeNode left = root.left;
         TreeNode right = root.right;
         
         root.left = invertTree(right);
         root.right = invertTree(left);
         
         return root;
         */
         
         /**
          * By using queue this can be converted to BFS
          * Below code is copied from Discussion @author_jmnarloch for reference
          * He also mentions that this solution will optimize on overflowing by using LL
          * 
          * "by default each thread in Java can alocate up to 1MB for it's stack
          * (this is various depending on the JVM version and operating system that is being run). 
          * The LinkedList/Stack/Queue in contrary will be allocated on managed heap, which by default can grow up to 1/4 of your phisycal memory."
          */
            /*
            if (root == null) {
                return null;
            }
    
            final Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
    
            while(!queue.isEmpty()) {
                final TreeNode node = queue.poll();
                final TreeNode left = node.left;
                node.left = node.right;
                node.right = left;
    
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            return root;
            */
    }
}
