package Hashmap.Colors_of_balls;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        HashMap<Character,Integer> count = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] colors = new char[N];
        for(int i = 0;i<N;i++){
            colors[i] = sc.next().toUpperCase().charAt(0);
            count.put(colors[i], count.getOrDefault(colors[i],0) + 1);
        }

       boolean found = false;
        for(int i = 0; i<N;i++){
            if(count.get(colors[i]) % 2 != 0){
                System.out.println(colors[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("All balls are even");
        }
        sc.close();
    }
}
