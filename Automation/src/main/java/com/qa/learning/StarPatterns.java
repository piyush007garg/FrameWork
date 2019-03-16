package com.qa.learning;

public class StarPatterns {

	/**
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	
//	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//	}
	
  /**
   *      *
   *     **
   *    ***
   *   ****
   *  *****
   */
	
//	public static void main(String[] args) {
//		int i, j, k=4;
//        for(i=0; i<5; i++)
//        {
//            for(j=0; j<k; j++)
//            {
//                System.out.print(" ");
//            }
//            k = k - 1;
//            for(j=0; j<=i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//		}
	
	/**
	 *  *****
	 *  ****
	 *  ***
	 *  **
	 *  *
	 */
	
//	public static void main(String[] args) {
//		for(int i =5;i>0;i--) {
//			for(int j =0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//	}
	
	public static void main(String[] args) {
		String s = "akansha";
		int piyush=0;
		
		for(Character Char : s.toCharArray() ) {
			piyush++;
		}
		System.out.println(piyush);
		
		
	}
	
	

}
