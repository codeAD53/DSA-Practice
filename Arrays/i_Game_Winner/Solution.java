package Arrays.i_Game_Winner;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Si = 0;
        int Ti = 0;
        int winner = 0;
        int maxLead = 0;
        int lead = 0;
        
        for(int i = 1;i<=n;i++){
             Si += sc.nextInt(); 
             Ti += sc.nextInt();
             lead = Math.abs(Si - Ti);
            if(Si > Ti){
                if(lead > maxLead){
                    maxLead = lead;
                    winner = 1;
                }
            }else{
               if(lead > maxLead){
                maxLead = lead;
                winner = 2;
               }
            }        
        }
        System.out.println(winner +" "+ maxLead);

    }
}
