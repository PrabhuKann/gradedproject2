package com.greatlearning.gradedproject2q1;

import java.util.*;
import java.util.stream.IntStream;
public class constructionPlan {
   
	public static void main(String[] args) {
	
		int n;
		Scanner sc=new Scanner(System.in);  
		System.out.print("enter the total no of floors in the building ");  
		//reading the number of elements from the that we want to enter  
		n=sc.nextInt();  
		int[] array = new int[n];  


		
		for(int i=0; i<n; i++)  
		{  
			int k = i + 1;
			System.out.println("enter the floor size given on day : " + k);
			
			//reading array elements from the user   
		    array[i]=sc.nextInt();  
		}
			
		//result code starts here
		System.out.println("The order of construction is as follows");
	    int w = n;    
	    for(int k=1; k<=n ;k++)
			
		{ 
	    	
	    	System.out.println("Day : " + k);
	    	
	    	
			
	    	Stack<Integer> STACK = new Stack<Integer>();

			if(w==array[k-1]) 
	    	  {
				
	    			
	    			for(int j=0; j <k;j++) 
	    			 {
	    				 for(int i=0;i<k;i++) 
	    				   {
	    					
	    					   if(array[i]==w) 
	    					    {
	    				          STACK.push(w);
	    				          w = w -1;
	    					    }
	    									
				            }
	    				}
	    						
	    	  }
	    	System.out.println(STACK.toString().replace("[","").replace("]","").replace(","," "));
			STACK.clear(); //to make empty the array
                 
	    	}
	  //result code ends here
		}
	}	