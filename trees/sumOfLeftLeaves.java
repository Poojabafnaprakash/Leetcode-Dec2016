package trees;

import java.util.LinkedList;
import java.util.Queue;

public class sumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        int leavesSum = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            if(node.left!=null){
                 q.add(node.left);
                 if(node.left.left == null && node.left.right == null)
                    leavesSum += node.left.val;
            }
            if(node.right!=null)
                q.add(node.right);
        }
        return leavesSum;
    }
}
