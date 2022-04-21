package org.programs;
import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		
			int rem = 0, count = 0;
			while (number > 0) {
				count++;
				number = number / 10;

			}
			System.out.println("number of the digits in the number is " + count);

		} 

	}

