package Number_Problems.Spy_no;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int original = number;
		int sum = 0;
		int product = 1;

		if (number == 0) {
			product = 0;
		}

		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			product *= digit;
			number /= 10;
		}

		if (sum == product) {
			System.out.println(original + " is a Spy number");
		} else {
			System.out.println(original + " is not a Spy number");
		}

		sc.close();
	}
}
