package Number_Problems.Harshad_No;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<=0){
            System.out.println(N+" is not a harshad number");
            sc.close();
            return;
        }
        int original = N;
        int sum = 0;
        while(N != 0){
            sum += N % 10;
            N /=10;
        }
        if(original % sum == 0){
            System.out.println(original+" is a Harshad number");
        }else{
            System.out.println(original+" is not a Harshad number");
        }
        sc.close();
    }
}
