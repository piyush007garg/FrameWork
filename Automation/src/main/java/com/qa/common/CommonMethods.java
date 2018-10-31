package com.qa.common;

public class CommonMethods {

		/**
		 * Find Duplicate Elements in a String
		 * @return 
		 */
	public static StringBuffer findDuplicateCharacterInsideAString(String str) {
		int j;
		StringBuffer stringbuffer = new StringBuffer();
		int i;
		char[] characterArray = sortAString(str);
		for ( i = 0; i < characterArray.length; i = j ) {
			for (j = i + 1; j < characterArray.length; j++) {
				System.out.println(i+" "+j);
				if (characterArray[i] != characterArray[j]) {
					stringbuffer.append(characterArray[i]);
					break;
				} 	
			}	
		}
		stringbuffer.append(characterArray[i-1]);
		return stringbuffer;
	}
	
	public static char[] sortAString(String str) {
		char[] characterArray = str.toLowerCase().toCharArray();
		for(int i =0;i<characterArray.length;i++) {
			for(int j=i+1;j<characterArray.length;j++) {
				if(characterArray[i]>characterArray[j]) {
					char temp = characterArray[j];
					characterArray[j]=characterArray[i];
					characterArray[i]=temp;
				}
			}
		}
		return characterArray;
	}
	
	public static void main(String[] args) {
		System.out.println(findDuplicateCharacterInsideAString("aaabbdeefg"));
	}

}
