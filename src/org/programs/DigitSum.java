package org.programs;
import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter at least 2 digit number to get the sum of digits: ");
		int number = sc.nextInt();

		if (number / 10 >= 1) {
			int rem = 0, sum = 0;
			while (number > 0) {
				rem = number % 10;
				sum = sum + rem;
				number = number / 10;

			}
			System.out.println("sum of digits is " + sum);

		} else {
			System.out.println("please enter atleast 2 digit number");
		}
	}

}
