package trees;

public class maxDepthOfTree {
	 public int maxDepth(TreeNode root) {
	        if(root == null)
	            return 0;
	        int count = 0;
	        if(root!=null){
	            int left = maxDepth(root.left);
	            int right = maxDepth(root.right);
	            count = (left > right)? left: right;
	        }
	        
	        return count+1;
	    }
}
