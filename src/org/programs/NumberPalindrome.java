package org.programs;

public class NumberPalindrome {
	public static void main(String[] args) {
		int num = 1213, rem = 0, rev = 0;
		int qu = num;
		
		while(qu>0) {
			rem = qu%10;
			rev = rev*10+rem;
			qu = qu/10;
		}
		if (rev==num) {
		System.out.println(num+" is Palindrome");	
		}
		else {
			System.out.println(num+" is NOT Palindrome");
		}
	}

}
