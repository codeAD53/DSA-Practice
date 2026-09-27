package Arrays.Balance_Equilibrium;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        int totalSum = 0;
        for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        
        int index = -1;
        int leftSum = 0;
        for(int i = 0;i<N;i++){
        int rightSum = totalSum - leftSum - arr[i];
        
        if(leftSum == rightSum){
            index = i;
            break;
        }
        
        leftSum += arr[i];
        }
        if(index != -1){
            System.out.println("Balanced Equilibrium exist at "+index);
        }else{
            System.out.println("No Equilibrum Exists");
        }
    }
}
