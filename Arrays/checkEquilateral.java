package Arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class checkEquilateral {
	static int lines;
	public void checkEquilateralTriangle(int a, int b, int c){	        
	        if(a <= 0 || b <= 0 || c <= 0)
	        	System.out.println("None of these");
	        else if(a == b && b == c)
	        	System.out.println("Equilateral");
	        else if(((a == b) && (a != c)) ||
	                ((a == c) && (a != b)) ||
	                ((b == c) && (b != a)))
	        	System.out.println("Isosceless");
	        else if((a != b) && (a != c) && (b != c))
	        	System.out.println("Scalene");
	        else
	        	System.out.println("None of these");
	}
	
	public void checkTriangleMap(int[] arr){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<3; i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		if(map.containsKey(0))
			System.out.println("None of these");
		else if(map.containsValue(3))
			System.out.println("Equilateral");
		else if(map.containsValue(2))
			System.out.println("Isosceles");
		else if(map.containsValue(1))
			System.out.println("Scalene");
		else System.out.println("None of these");
		
	}
	public static void main(String args[]){
	    Scanner scan = new Scanner(System.in);
	    checkEquilateral obj = new checkEquilateral();
	    lines = scan.nextInt();
	    int[][] arr = new int[lines][3];
	    for(int i = 0; i < lines; i++){
	    	for(int j = 0; j<3; j++){
	    		arr[i][j] = scan.nextInt();
	    	}
	    }
	    scan.close();
	    for(int i = 0; i < lines; i++){
	    	obj.checkTriangleMap(arr[i]);
	    	obj.checkEquilateralTriangle(arr[i][0], arr[i][1], arr[i][2]);	    	
	    }
	    
	}
}
