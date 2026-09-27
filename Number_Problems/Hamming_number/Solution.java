package Number_Problems.Hamming_number;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<0){
         System.out.println("Invalid Input");
         return;
        }
        while(N % 2 == 0){
            N /= 2;
        }

        while(N % 3 == 0){
            N /= 3;
        }

        while(N % 5 == 0){
            N /= 5;
        }

        if(N == 1){
            System.out.println("Hamming number");
        }else{
            System.out.println("Not a hamming number");
        }
    }
    
}
