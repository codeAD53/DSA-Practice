package Number_Problems.Perfect_no;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 1) {
            System.out.println(N + " is not a perfect number");
            sc.close();
            return;
        }

        int sum = 1;
        for (int divisor = 2; divisor * divisor <= N; divisor++) {
            if (N % divisor == 0) {
                sum += divisor;

                int quotient = N / divisor;
                if(quotient != divisor){
                    sum += quotient;
                }
            }
        }

        if (sum == N) {
            System.out.println(N + " is a perfect number");
        } else {
            System.out.println(N + " is not a perfect number");
        }

        sc.close();
    }
}
