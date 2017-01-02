package trees;

public class maxElementInBinaryTree {
	binaryTreeNode root;
	
	
	
	int MaxElement(binaryTreeNode root){
		int max = Integer.MIN_VALUE;
		if(root != null){
			int maxL, maxR;
			maxL = MaxElement(root.leftLink);
			maxR = MaxElement(root.rightLink);
			
			if(maxL > maxR)
				max = maxL;
			else
				max = maxR;			
		}
		
		if(root.data > max){
			max = root.data;
			return max;
		}
		else
			return max;
	}
	
	public static void main(String args[]){
		maxElementInBinaryTree node = new maxElementInBinaryTree();
		node.MaxElement(new binaryTreeNode(1));
		node.MaxElement(new binaryTreeNode(1));
		node.MaxElement(new binaryTreeNode(1));
		node.MaxElement(new binaryTreeNode(1));
	}
}



