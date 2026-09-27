package Arrays.DoublyMarkovMatrix;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 1 || N > 100) {
            System.out.println("Invalid Entry");
            return;
        }
        double[][] arr = new double[N][N];
        
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                arr[i][j] = sc.nextDouble();
            }
        }
        
        boolean DoublyMM = true;
      
        for(int i = 0;i<N;i++){
             int sumRows = 0;
             int sumColumns = 0;
            for(int j = 0; j<N;j++){
                if(arr[i][j] < 0){
                     System.out.println("Invalid Entry");
                     return;
                }
                sumRows += arr[i][j];
                sumColumns += arr[j][i];
            }
            if(sumRows != 1 || sumColumns != 1){
                DoublyMM = false;
            }
        }

        if(DoublyMM){
            System.out.println("It is a Doubly Matrix");
        }else{
            System.out.println("It is not a Doubly Matrix");
        }
       
    }
}
