package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class zigzagLevelOrder {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Stack<Integer> stack = new Stack<Integer>();
        
        List<List<Integer>> outterList = new ArrayList<List<Integer>>();
        int count = 1;
        
        if(root!=null)
            q.offer(root);
        
        while(!q.isEmpty()){
            List<Integer> innerList = new ArrayList<Integer>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode temp = q.remove();
                if(count % 2 != 0)
                    innerList.add(temp.val);
                else
                    stack.push(temp.val);
                    
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
            }
            while(!stack.isEmpty())
                    innerList.add(stack.pop());
            count++;
            outterList.add(innerList);
        }
        
        return outterList;
    }
}
