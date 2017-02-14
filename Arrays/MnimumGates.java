package Arrays;

public class MnimumGates {

	 
	 int findMinGates(int arrivals[],int departures[],int flights) {
	   int res = 1, max = 1; int i = 1, j = 0;
	   int temp=0;
	     for (int k = 0; k < flights; k++) 
	         {
	             for (int l = k + 1; l < flights; l++) 
	             {
	                 if (departures[k] > departures[l]) 
	                 {
	                     temp = departures[i];
	                     departures[k] = departures[l];
	                     departures[l] = temp;
	                 }
	             }
	         }
	   while (i < flights && j < flights) { 
	    if (arrivals[i] <= departures[j]) { 
	     ++res; 
	     if (res > max) { 
	      max = res; 
	      } 
	     ++i; 
	     } else {
	      --res; 
	      ++j; 
	      } 
	    } 
	   return max; 
	   }
	 
	 public static void main(String args[]){
	  MnimumGates mn = new MnimumGates();
	  int[] arrivals, departures;
	  arrivals = new int[3];
	  departures = new int[3];
	  int flights = 3;
	  int max=0;
	  max=mn.findMinGates(arrivals, departures, flights);
	  System.out.println("max is"+max);
	  
	 }

	 
	}