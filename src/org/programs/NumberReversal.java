package org.programs;

public class NumberReversal {
	public static void main(String[] args) {
		int num = 12345, rem = 0, rev = 0;
		int qu = num;
		
		while(qu>0) {
			rem = qu%10;
			rev = rev*10+rem;
			qu = qu/10;
		}System.out.println(rev);
	}

}
