package Number_Problems.Prime_Number;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N < 2){
            System.out.println(N+" is not a Prime number");
        }
        boolean isPrime = N >= 2;

        for(int i = 2;i*i<=N;i++){ // For every factor greater than √N, there is a corresponding factor smaller than √N, so checking beyond √N is unnecessary
            if(N%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(N+" is a Prime number");
        }else{
            System.out.println(N+" is not a Prime number");
        }
    }
}
