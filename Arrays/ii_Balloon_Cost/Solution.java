package Arrays.ii_Balloon_Cost;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int cost_green = sc.nextInt();
            int cost_purple = sc.nextInt();
           
            int n = sc.nextInt();

            int problem1Count = 0;
            int problem2Count = 0;
            for(int i =0;i<n;i++){
                int P1 = sc.nextInt();
                int P2 = sc.nextInt();
                if(P1 == 1){
                    problem1Count++;
                }
                if(P2 == 1){
                    problem2Count++;
                }
            }

            int arrange1Cost = problem1Count * cost_green + problem2Count * cost_purple;
            int arrange2Cost = problem1Count * cost_purple + problem2Count * cost_green;

            int minimum = Math.min(arrange1Cost,arrange2Cost);
            System.out.println(minimum);
        }
    }
}
