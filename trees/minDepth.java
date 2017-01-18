package trees;

import java.util.LinkedList;
import java.util.Queue;

public class minDepth {
	public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int count = 0; boolean flag = false;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            count++;
            for(int i=0; i<size;i++){
                TreeNode node;
                node = q.remove();
                if(node.left == null && node.right == null){
                    flag = true;
                    break;
                }
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            if(flag) break;
        }
        return count;
        
    }
}
