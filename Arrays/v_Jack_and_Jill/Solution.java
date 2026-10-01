package Arrays.v_Jack_and_Jill;

import java.util.Scanner;

public class Solution {

    int play_the_game(int[] target, int size) {
        int operations = 0;

        int maxBit = 0;
        for(int i = 0; i < size; i++){
            operations += Integer.bitCount(target[i]);
            int bits = Integer.toBinaryString(target[i]).length();
            maxBit = Math.max(maxBit, bits);
        }
        operations += maxBit - 1;
        return  operations;
}
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] target = new int[size];
        for (int i = 0; i < size; i++) {
            target[i] = sc.nextInt();
        }
        System.out.println(sol.play_the_game(target, size));
        sc.close();
    }
}