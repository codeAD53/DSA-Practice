package Arrays.Assign_Chocolates;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int[] greedyFactor = new int[N1];
        for (int i = 0; i < N1; i++) {
            greedyFactor[i] = sc.nextInt();
        }
        
        int N2 = sc.nextInt();
        int[] chocolates = new int[N2];
        for (int i = 0; i < N2; i++) {
            chocolates[i] = sc.nextInt();
        }

        Arrays.sort(greedyFactor);
        Arrays.sort(chocolates);

        int happy = 0;
        int left = 0;
        int right = 0;
        while(left < N1 && right < N2){
            if(chocolates[right] >= greedyFactor[left]){
                happy++;
                left++;
                right++;
            }else{
                right++;
            }
        }
        System.out.println(happy);

        sc.close();
    }
}
