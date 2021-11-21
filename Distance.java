package com.functional;
import java.util.Scanner;

public class Distance {
		public static void main(String arg[]){
		
	     int x1,y1;
	     double dis;
		
	   Scanner sc=new Scanner(System.in);
	 
	   System.out.println("enter x1 point");
          x1=sc.nextInt();
		    
       System.out.println("enter y1 point");
          y1=sc.nextInt();
	  
			 dis= Math.sqrt( Math.pow(x1, 2) + Math.pow(y1, 2));
	 	 	    	 	    
	  	         System.out.println("The distance of the point from (" + x1 + ", " + y1 + ") to the origin is: " +dis);
	 
		}
	 
	}

