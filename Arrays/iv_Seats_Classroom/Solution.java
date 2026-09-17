package Arrays.iv_Seats_Classroom;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        if(n > r){
            System.out.println("Cannot adjust "+n+" people on "+r+" seats");
        }
        else{
            long result = 1;
            for(int i = 0; i<n; i++){
                result = result * (r-i);
            }
          
            System.out.println(result);
        }


    }
}
