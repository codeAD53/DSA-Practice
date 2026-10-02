package Arrays.College_Parking;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int maxCount = 0;
        int[][] parking = new int[R][C];
        int row = 0;
        for(int i = 0; i<R; i++){
            int count = 0;
            for(int j = 0; j<C;j++){
                parking[i][j] = sc.nextInt();
                if(parking[i][j] == 1){
                    count++;
                }                
            }
            
            if(count > maxCount){
                maxCount = count;
                row = i + 1;
            }
        }
        System.out.println(row);
        sc.close();
    }
}
