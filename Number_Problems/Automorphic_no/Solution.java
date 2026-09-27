package Number_Problems.Automorphic_no;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int square = N * N;
        if(square % (int)Math.pow(10, String.valueOf(N).length()) == N){
            System.out.println(N+" is an Automorphic number");
        }else{
            System.out.println(N+" is not an Automorphic number");
        }
        sc.close();
    }
}
