package trees;

/*
class Node 
    int data;
    Node left;
    Node right;
*/
public class top_view_HackerRank {
	
	void top_view(Node root)
	{
	    if(root==null)
	        return;
	    
	    printDirection(root.left, 1);
	    System.out.print(root.data + " ");
	    printDirection(root.right, -1);
	}

	void printDirection(Node root, int direction){
	    if(root==null)
	        return;
	    
	    if(direction == 1){
	        printDirection(root.left, direction);
	        System.out.print(root.data + " ");
	    }
	    else{
	        System.out.print(root.data + " ");
	        printDirection(root.right, direction);
	    } 
	    
	}

}
