package org.programs;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();

		boolean flag = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}