package trees;
import java.util.Scanner;

//class Node{
//    Node left,right;
//    int data;
//    Node(int data){
//        this.data=data;
//        left=right=null;
//    }
//}

public class heightOfBinaryTree {
	
	static int getHeight(Node root) {
        int count = Integer.MIN_VALUE;
        if(root==null){
            return -1;
        }
      	if(root!=null){
            int countL, countR;
            countL = getHeight(root.left);
            countR = getHeight(root.right);
            if(countL > countR)
                count = countL;
            else
                count = countR;
        }
        return count+1;
    }
	
//	public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt();
//        Node root=null;
//        while(T-->0){
//            int data=sc.nextInt();
//            root=insert(root,data);
//        }
//        int height=getHeight(root);
//        System.out.println(height);
//    }	

}
