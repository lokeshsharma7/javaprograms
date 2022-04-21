package org.programs;

public class Fibonacci {

	public static void main(String[] args) {
		int first = 0, second = 1;
		
		
		for (int i = 0; i <8; i++) {
			int temp = first+second ;
			first = second;
			second = temp;	
//			if (temp<10) {
				System.out.println(temp);
//			}
			
		}
		
	}

}
