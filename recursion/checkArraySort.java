package recursion;

import java.util.*;
import java.lang.*;
import java.io.*;


class checkArraySort {
    public static boolean check(int[] a, int i){
	    if((a.length - 1) == i){
	        return true;
	    }
	    
	        if(a[i]<a[i+1]){
	            return check(a, i+1);
	        }
	        else{
	            return false;
	        }
	        
	       
	}
	public static void main (String[] args) {
	    boolean checker = false;
	    int[] a = { 0, 1, 2, 3};
	    checker = check(a, 0);
	    if(checker == true){
	        System.out.println("1");
	    }
	    else{
	        System.out.println("0");
	    }
		
	}
}
