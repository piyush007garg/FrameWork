package com.qa.learning;

public class StarPatterns {

	public static void main(String[] args) {

//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		 int i, j, k=4;
	        for(i=0; i<5; i++)
	        {
	            for(j=0; j<k; j++)
	            {
	                System.out.print(" ");
	            }
	            k = k - 1;
	            for(j=0; j<=i; j++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

}
