package trees;
import java.util.*;

class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }


public class LevelOrderTraversal {
	void LevelOrder_HackerRank(Node root)
    {
      Queue<Node> queue = new LinkedList<Node>();
       if(root!=null)
        queue.offer(root);
       
        while(!queue.isEmpty()){
            Node node;
            node = queue.poll();
            System.out.print(node.data + " ");
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
      
    }
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> outterList = new ArrayList<List<Integer>>();
        if(root!=null)
            queue.offer(root);
       
            TreeNode node;
            
            while(!queue.isEmpty()){
                List<Integer> innerList = new ArrayList<Integer>();
                int nextCount = queue.size();
                
                for(int j=1; j<= nextCount; j++){
                    node = queue.poll();
                    if(node != null){
                        innerList.add(node.val);
                        if(node.left != null){
                            queue.offer(node.left);
                        }
                        if(node.right != null){
                            queue.offer(node.right);
                        }
                    }
                }
                 outterList.add(innerList);
            }
        return outterList;
    }


}
