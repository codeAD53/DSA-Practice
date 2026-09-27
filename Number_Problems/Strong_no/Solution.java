package Number_Problems.Strong_no;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if( N <= 0){
            System.out.println(N+" is not a Strong number");
            sc.close();
            return;
        }
        int original = N;
        int sum = 0;
        while(N != 0){
            int digit = N % 10;
            int fact = 1;
            for(int i = 2; i<=digit; i++){
                fact *= i;
            }
            sum += fact;
            N/=10;
    }
    if(sum == original){
        System.out.println(original+" is a Strong number");
    }else{
        System.out.println(original+" is not a Strong number");
    }
    }
}
