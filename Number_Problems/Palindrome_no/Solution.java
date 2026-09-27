package Number_Problems.Palindrome_no;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int original = N;
        int rev = 0;

        while (N != 0) {
            int digit = N % 10;
            rev = rev * 10 + digit;
            N /= 10;
        }

        if (original == rev) {
            System.out.println(original + " is a palindrome number");
        } else {
            System.out.println(original + " is not a palindrome number");
        }

        sc.close();
    }
}
