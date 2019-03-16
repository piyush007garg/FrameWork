package com.qa.learning;

import java.util.HashSet;
import java.util.Set;

public class CheckCountOfUniqueEmail {

	public static void main(String[] args) {
		String[] emails = {"piyush.garg@gmail.com","piyush.garg+uyt@gmail.com"}; 
		System.out.println(checkUniqueEmail(emails));
	}
	
	public static int checkUniqueEmail(String[] emails) {
		Set<String> set = new HashSet();
		for(String email:emails) {
			String[] sepreateByAtTheRete = email.split("@");
			String[] secondSplit = sepreateByAtTheRete[0].replace(".", "").split("[+]");
			set.add(secondSplit[0]+sepreateByAtTheRete[1]);
		}
		return set.size();
	}

}
