package Arrays.Jack_and_Jill;

import java.util.Scanner;

public class Solution1 {
    public static int play_game(int[] target, int size) {
        int operations = 0;

        while (true) {
            boolean allZero = true;
            boolean allEven = true;

            for (int i = 0; i < size; i++) {
                if (target[i] != 0) {
                    allZero = false;
                }
                if (target[i] % 2 != 0) {
                    allEven = false;
                }
            }

            if (allZero) {
                return operations;
            }

            if (allEven) {
                for (int i = 0; i < size; i++) {
                    target[i] /= 2;
                }
                operations++;
            } else {
                for (int i = 0; i < size; i++) {
                    if (target[i] % 2 != 0) {
                        target[i]--;
                        operations++;
                        break;
                    }
                }
            }
        }
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