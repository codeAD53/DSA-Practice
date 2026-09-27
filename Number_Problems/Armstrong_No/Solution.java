package Number_Problems.Armstrong_No;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println(number + " is not an Armstrong number");
            sc.close();
            return;
        }

        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            int power = 1;

            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}
