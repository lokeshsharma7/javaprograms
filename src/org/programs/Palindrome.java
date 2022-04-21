package org.programs;

public class Palindrome {
public static void main(String[] args) {
	String name  = "madam";
	String rev = "";
	
	for (int i = name.length()-1; i>=0; i--) {
		char c = name.charAt(i)	;
		rev = rev+c;
		
	}
	if (name.equals(rev)) {
		System.out.println("It's palindrome");
		
	}
	else {
		System.out.println("not a palindrome");
	}
	}
}
