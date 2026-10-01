package Arrays.Event_in_College;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Time = sc.nextInt();
        int[] entering = new int[Time];
        for(int i = 0;i<Time;i++){
            entering[i] = sc.nextInt();
        }
        int current = 0;
        int max = 0;
        for(int i = 0; i<Time;i++){
           int leaving = sc.nextInt();
           current += entering[i] - leaving;
           max = Math.max(max, current);
        }
        System.out.println("Result: "+ max);
        sc.close();
    }
}